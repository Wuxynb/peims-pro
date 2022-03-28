package com.example.peims.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@ApiModel(description = "员工表")
public class User implements Serializable {
    @NotNull(message = "员工ID不能为空")
    @ApiModelProperty(value = "员工ID", required = true)
    private int PK_User_Id_nb;// 员工ID

    @NotNull(message = "员工姓名不能为空")
    @ApiModelProperty(value = "员工姓名", required = true)
    private String User_Name_s;// 员工名

    @NotNull(message = "员工密码不能为空")
    @ApiModelProperty(value = "员工密码")
    @Length(min = 3, max = 25, message = "员工密码长度范围为3~25")
    private int User_Password_nb;// 员工密码

    @ApiModelProperty(value = "员工工龄")
    private int User_Seniority_n;// 员工工龄

    @ApiModelProperty(value = "员工岗位标识")
    private int FK_User_PostionId_nb;// 岗位（说明1为普通员工，2为经理） FK_User_PostionId_nb

    @ApiModelProperty(value = "部门ID")
    private int FK_User_DepartmentId_nb;// 部门ID

    @ApiModelProperty(value = "员工性别")
    private String User_Sex_s;// 员工性别

    @ApiModelProperty(value = "员工照片URL地址")
    private String User_PhotoURL_s;// 员工照片URL

    private Department department;

    private Position position;

    public int getPK_User_Id_nb() {
        return PK_User_Id_nb;
    }

    public void setPK_User_Id_nb(int PK_User_Id_nb) {
        this.PK_User_Id_nb = PK_User_Id_nb;
    }

    public String getUser_Name_s() {
        return User_Name_s;
    }

    public void setUser_Name_s(String user_Name_s) {
        User_Name_s = user_Name_s;
    }

    public int getUser_Password_nb() {
        return User_Password_nb;
    }

    public void setUser_Password_nb(int user_Password_nb) {
        User_Password_nb = user_Password_nb;
    }

    public int getUser_Seniority_n() {
        return User_Seniority_n;
    }

    public void setUser_Seniority_n(int user_Seniority_n) {
        User_Seniority_n = user_Seniority_n;
    }

    public int getFK_User_PostionId_nb() {
        return FK_User_PostionId_nb;
    }

    public void setFK_User_PostionId_nb(int dptm_Position_n) {
        FK_User_PostionId_nb = dptm_Position_n;
    }

    public int getFK_User_DepartmentId_nb() {
        return FK_User_DepartmentId_nb;
    }

    public void setFK_User_DepartmentId_nb(int FK_User_DepartmentId_nb) {
        this.FK_User_DepartmentId_nb = FK_User_DepartmentId_nb;
    }

    public String getUser_Sex_s() {
        return User_Sex_s;
    }

    public void setUser_Sex_s(String user_Sex_s) {
        User_Sex_s = user_Sex_s;
    }

    public String getUser_PhotoURL_s() {
        return User_PhotoURL_s;
    }

    public void setUser_PhotoURL_s(String user_PhotoURL_s) {
        User_PhotoURL_s = user_PhotoURL_s;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "User{" +
                "PK_User_Id_nb=" + PK_User_Id_nb +
                ", User_Name_s='" + User_Name_s + '\'' +
                ", User_Password_nb=" + User_Password_nb +
                ", User_Seniority_n=" + User_Seniority_n +
                ", FK_User_PostionId_nb=" + FK_User_PostionId_nb +
                ", FK_User_DepartmentId_nb=" + FK_User_DepartmentId_nb +
                ", User_Sex_s='" + User_Sex_s + '\'' +
                ", User_PhotoURL_s='" + User_PhotoURL_s + '\'' +
                ", department=" + department +
                ", position=" + position +
                '}';
    }
}
