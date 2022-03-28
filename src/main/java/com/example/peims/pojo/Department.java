package com.example.peims.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department implements Serializable {
    private int PK_Dptm_id_nb;// 部门ID

    private String Dptm_Name_s;// 部门名称

    private String Dptm_Description_s;// 部门描述

}
