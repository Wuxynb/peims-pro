drop table if exists AsT;

drop table if exists CheckT;

drop table if exists Dptm;

drop table if exists Good;

drop table if exists Position;

drop table if exists SlTsk;

drop table if exists Slrcd;

drop table if exists Tax;

drop table if exists User;

drop table if exists Wage;

drop table if exists resume;

/*==============================================================*/
/* Table: AsT                                                   */
/*==============================================================*/
create table AsT
(
    As_id_n     int not null,
    As_status_s varchar(10),
    primary key (As_id_n)
);

/*==============================================================*/
/* Table: CheckT                                                */
/*==============================================================*/
create table CheckT
(
    PK_Check_Id_n     int           not null auto_increment unique,
    PK_FK_Check_Id_nb numeric(7, 0) not null,
    Check_Date_dt     datetime          not null,
    As_id_n           int           not null default 1,
    primary key (PK_FK_Check_Id_nb, Check_Date_dt)
);

/*==============================================================*/
/* Table: Dptm                                                  */
/*==============================================================*/
create table Dptm
(
    PK_Dptm_id_nb      numeric(2, 0) not null,
    Dptm_Name_s        varchar(10)   not null,
    Dptm_Description_s varchar(10000),
    primary key (PK_Dptm_id_nb)
);

/*==============================================================*/
/* Table: Good                                                  */
/*==============================================================*/
create table Good
(
    PK_Good_Id_nb numeric(20, 0) not null,
    Good_Name_s   varchar(20)    not null,
    Good_Price_f  float          not null,
    Good_Number_n int,
    primary key (PK_Good_Id_nb)
);

/*==============================================================*/
/* Table: Position                                              */
/*==============================================================*/
create table Position
(
    PK_Position_Id_nb      numeric(1, 0) not null,
    Position_Name_s        varchar(10),
    Position_Description_s varchar(10000),
    Position_Salary_f      float         not null,
    primary key (PK_Position_Id_nb)
);

/*==============================================================*/
/* Table: SlTsk                                                 */
/*==============================================================*/
create table SlTsk
(
    PK_SlTsk_Id_n      int         not null auto_increment,
    SlTsk_Id_nb        numeric(7, 0),
    SlTsk_TakeManId_nb numeric(7, 0),
    SlTsk_Title_s      varchar(20) not null,
    SlTsk_Money_f      float       not null,
    SlTsk_Start_dt     date        not null,
    SlTsk_End_dt       date        not null,
    primary key (PK_SlTsk_Id_n)
);

/*==============================================================*/
/* Table: Slrcd                                                 */
/*==============================================================*/
create table Slrcd
(
    PK_Slrcd_id_n      int            not null auto_increment,
    FK_User_Id_nb      numeric(7, 0)  not null,
    FK_Slrcd_GoodId_nb numeric(20, 0) not null,
    Slrcd_GoodNum_n    int            not null,
    Slrcd_Total_f      float          not null,
    Slrcd_Date_dt      date           not null,
    primary key (PK_Slrcd_id_n)
);

/*==============================================================*/
/* Table: Tax                                                   */
/*==============================================================*/
create table Tax
(
    PK_Tax_Id_n      int   not null auto_increment,
    Tax_MoneyStart_f float not null,
    Tax_MoneyEnd_f   float not null,
    Tax_Tax_f        float not null,
    primary key (PK_Tax_Id_n)
);

/*==============================================================*/
/* Table: User                                                  */
/*==============================================================*/
create table User
(
    PK_User_Id_nb           numeric(7, 0)  not null,
    FK_User_DepartmentId_nb numeric(2, 0),
    FK_User_PostionId_nb    numeric(1, 0),
    User_Name_s             varchar(10)    not null,
    User_Password_nb        numeric(16, 0) not null default 12345678,
    User_Seniority_n        int            not null default 0,
    User_Sex_s              varchar(2)     not null,
    User_PhotoURL_s         varchar(200),
    primary key (PK_User_Id_nb)
);

alter table User
    comment '员工信息表';

/*==============================================================*/
/* Table: Wage                                                  */
/*==============================================================*/
create table Wage
(
    PK_FK_Wage_Id_nb   numeric(7, 0) not null,
    PK_Wage_Date_s     varchar(7)    not null,
    Wage_Seniority_f   float         not null,
    Wage_Position_f    float         not null,
    Wage_Merits_f      float         not null,
    Wage_Absenteeism_f float         not null,
    Wage_Tax_f         float         not null,
    Wage_Money_f       float         not null,
    primary key (PK_FK_Wage_Id_nb, PK_Wage_Date_s)
);

create table resume
(
    id           decimal(7) primary key,
    education    varchar(8),
    polSta       varchar(8),
    height       int,
    native       varchar(10),
    birth        datetime,
    idCard       varchar(18),
    address      varchar(80),
    phone        varchar(13),
    postcode     varchar(6),
    graduate     varchar(30),
    graduateTime date,
    major        varchar(40),
    hobby        varchar(200)
);

alter table CheckT
    add constraint FK_Reference_1 foreign key (PK_FK_Check_Id_nb)
        references User (PK_User_Id_nb) on delete cascade on update cascade;

alter table CheckT
    add constraint FK_Reference_6 foreign key (As_id_n)
        references AsT (As_id_n) on delete cascade on update cascade;

alter table Slrcd
    add constraint FK_Reference_4 foreign key (FK_Slrcd_GoodId_nb)
        references Good (PK_Good_Id_nb) on delete cascade on update cascade;

alter table Slrcd
    add constraint FK_Reference_7 foreign key (FK_User_Id_nb)
        references User (PK_User_Id_nb) on delete cascade on update cascade;

alter table User
    add constraint FK_Reference_8 foreign key (FK_User_DepartmentId_nb)
        references Dptm (PK_Dptm_id_nb) on delete restrict on update restrict;

alter table User
    add constraint FK_Reference_9 foreign key (FK_User_PostionId_nb)
        references Position (PK_Position_Id_nb) on delete restrict on update restrict;

alter table Wage
    add constraint FK_Reference_3 foreign key (PK_FK_Wage_Id_nb)
        references User (PK_User_Id_nb) on delete cascade on update cascade;
