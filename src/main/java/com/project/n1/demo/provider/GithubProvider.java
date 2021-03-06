package com.project.n1.demo.provider;

import com.alibaba.fastjson.JSON;
import com.project.n1.demo.dto.AccessTokenDTO;
import com.project.n1.demo.dto.GithubUser;
import okhttp3.*;
import org.springframework.stereotype.Component;

import java.io.IOException;

import static com.sun.xml.internal.ws.api.message.Packet.Status.Request;

@Component
public class GithubProvider {
    public String getAccessToken(AccessTokenDTO accessTokenDTO)  {
       MediaType mediaType= MediaType.get("application/json; charset=utf-8");

        OkHttpClient client = new OkHttpClient();
        RequestBody body = RequestBody.create(mediaType, JSON.toJSONString(accessTokenDTO));
                    Request request = new Request.Builder()
                    .url("https://github.com/login/oauth/access_token?client_id=749a90629e5d71676f77&client_secret=110eb98f42b037d5f7381af3cd76331dcebee820&code="+accessTokenDTO.getCode()+"&redirect_uri=http://localhost:8887/callback&state=1")
                    .post(body)
                    .build();
            try (Response response = client.newCall(request).execute()) {
                String string = response.body().string();
                String token = string.split("&")[0].split("=")[1];
                return token;
            }catch (Exception e){
                e.printStackTrace();
        }return null;
    }

    public GithubUser getUser(String accessToken)  {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://api.github.com/user?access_token="+accessToken)
                .build();
        try {
            Response response = client.newCall(request).execute();
            String string = response.body().string();
            return JSON.parseObject(string, GithubUser.class);
        } catch (IOException e) {

        }
        return null;


}
}
