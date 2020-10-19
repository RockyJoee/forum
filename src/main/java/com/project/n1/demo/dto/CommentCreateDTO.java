package com.project.n1.demo.dto;

import lombok.Data;

@Data
public class CommentDTO {
    private Long parentId;
    private String content;
    private Integer type;
}
