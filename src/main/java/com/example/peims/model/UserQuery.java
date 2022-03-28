package com.example.peims.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserQuery {
    private Integer pageNum = 1;
    private Integer pageSize = 10;
    private String User_Name_s = "";
}
