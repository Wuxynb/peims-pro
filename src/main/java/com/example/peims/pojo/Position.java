package com.example.peims.pojo;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;

//岗位表
@NoArgsConstructor
@AllArgsConstructor
public class Position implements Serializable {

    private int PK_Position_Id_nb;// 岗位ID

    private String Position_Name_s;// 岗位名称

    private String Position_Description_s;// 岗位描述

    private float Position_Salary_f;// 岗位工资

    public int getPK_Position_Id_nb() {
        return PK_Position_Id_nb;
    }

    public void setPK_Position_Id_nb(int pK_Position_Id_nb) {
        PK_Position_Id_nb = pK_Position_Id_nb;
    }

    public String getPosition_Name_s() {
        return Position_Name_s;
    }

    public void setPosition_Name_s(String position_Name_s) {
        Position_Name_s = position_Name_s;
    }

    public String getPosition_Description_s() {
        return Position_Description_s;
    }

    public void setPosition_Description_s(String position_Description_s) {
        Position_Description_s = position_Description_s;
    }

    public float getPosition_Salary_f() {
        return Position_Salary_f;
    }

    public void setPosition_Salary_f(float position_Salary_f) {
        Position_Salary_f = position_Salary_f;
    }

    @Override
    public String toString() {
        return "Position{" +
                "PK_Position_Id_nb=" + PK_Position_Id_nb +
                ", Position_Name_s='" + Position_Name_s + '\'' +
                ", Position_Description_s='" + Position_Description_s + '\'' +
                ", Position_Salary_f=" + Position_Salary_f +
                '}';
    }
}
