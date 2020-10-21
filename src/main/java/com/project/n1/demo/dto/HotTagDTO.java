package com.project.n1.demo.dto;

import lombok.Data;
import org.jetbrains.annotations.NotNull;
@Data
public class HotTagDTO implements Comparable{  private String name;
    private Integer priority;

    @Override
    public int compareTo(Object o) {
        return this.getPriority() - ((HotTagDTO) o).getPriority();
    }
}
