package com.example.peims.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

//考勤状态表
@Data
@Log4j2
@NoArgsConstructor
@AllArgsConstructor
public class AttendanceStatus {
    private int As_id_n;// 状态ID
    private String As_status_s;// 状态描述

    public int getAs_id_n() {
        return As_id_n;
    }

    public void setAs_id_n(int as_id_n) {
        As_id_n = as_id_n;
    }

    public String getAs_status_s() {
        return As_status_s;
    }

    public void setAs_status_s(String as_status_s) {
        As_status_s = as_status_s;
    }
}
