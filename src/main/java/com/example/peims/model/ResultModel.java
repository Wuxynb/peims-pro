package com.example.peims.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultModel {
    private Integer code;
    private String msg;
    private Integer count;
    private Object data;
}
