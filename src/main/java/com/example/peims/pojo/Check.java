package com.example.peims.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Transient;

import java.util.Date;

// 签到考勤表
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Check {

    private Long PK_Check_Id_n;// 签到流水号

    private Date PK_Check_Date_dt;// 签到日期

    private Integer PK_FK_Check_Id_nb;// 员工ID

    private Integer As_id_n;// 考勤状态 默认为1（迟到）

    @Transient
    private String name;

    @Transient
    private String as;

}
