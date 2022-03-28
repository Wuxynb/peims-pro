insert into Tax
values (1, 0, 5000.0, 0);
insert into Tax
values (2, 5001, 10000.0, 0.1);
insert into Tax
values (3, 10001, 20000.0, 0.12);
insert into Tax
values (4, 20001, 35000.0, 0.13);
insert into Tax
values (5, 35001, 50000.0, 0.15);
insert into Tax
values (6, 50001, 75000.0, 0.18);
insert into Tax
values (7, 75001, 100000.0, 0.21);
insert into Tax
values (8, 100001, 200000.0, 0.22);
insert into Tax
values (9, 200001, 500000.0, 0.23);
insert into Tax
values (10, 500001, 800000.0, 0.24);
insert into Tax
values (11, 800001, 1100000.0, 0.25);

insert into Good
values (1, '手机', 1000.0, 10);
insert into Good
values (2, '电脑', 21000.0, 110);
insert into Good
values (3, '平板', 28000.0, 110);
insert into Good
values (4, '电视', 27000.0, 56);

insert into Position
values (1, '普通职工', '该岗位是普通职工', 1000.0);
insert into Position
values (2, '部门经理', '该岗位是部门经理', 2000.0);

insert into Dptm
values (10, '人事管理', '这是人事管理部门');
insert into Dptm
values (20, '财务管理', '这是财务管理部门');
insert into Dptm
values (30, '销售', '这是销售部门');

insert into AsT
values (0, '已考勤');
insert into AsT
values (1, '迟到');
insert into AsT
values (2, '旷工');
insert into AsT
values (3, '出差');
insert into AsT
values (4, '公出');

insert into User
values (1011234, 10, 1, '张三', 12345678, 3, '男', 'http://122.51.2.157:8080/images/1.jpg');
insert into User
values (1021234, 10, 2, '王生安', 12345678, 3, '男', 'http://122.51.2.157:8080/images/2.jpg');
insert into User
values (2011234, 20, 1, '李鑫灏', 11111111, 99, '女', 'http://122.51.2.157:8080/images/3.jpg');
insert into User
values (2011235, 20, 1, '刘狗玩', 11111111, 99, '女', 'http://122.51.2.157:8080/images/4.jpg');
insert into User
values (2021234, 20, 2, '钱勤堃', 11111111, 88, '男', 'http://122.51.2.157:8080/images/5.jpg');
insert into User
values (2021235, 20, 2, '皮狗玩', 11111111, 88, '男', 'http://122.51.2.157:8080/images/6.jpg');
insert into User
values (3011234, 30, 1, '蔡壮保', 11111111, 77, '男', 'http://122.51.2.157:8080/images/7.jpg');
insert into User
values (3021234, 30, 2, '潘恩依', 11111111, 66, '男', 'http://122.51.2.157:8080/images/8.jpg');
insert into User
values (3021235, 30, 2, '邱石', 11111111, 66, '女', 'http://122.51.2.157:8080/images/9.jpg');
insert into User
values (2011111, 30, 2, '韦德', 123456789, 30, '女', 'http://122.51.2.157:8080/images/10.jpg');
insert into User
values (2011112, 30, 1, '吴某某', 123456789, 30, '女', 'http://122.51.2.157:8080/images/11.jpg');

insert into Wage
values (1011234, '2019-10', 1000.0, 1000.0, 1000.0, 1000.0, 0.2, 3200.0);
insert into Wage
values (1021234, '2019-10', 1000.0, 1000.0, 1000.0, 1000.0, 0.2, 3200.0);
insert into Wage
values (2011234, '2019-10', 1000.0, 1000.0, 1000.0, 1000.0, 0.2, 3200.0);
insert into Wage
values (2011235, '2019-10', 1000.0, 1000.0, 1000.0, 1000.0, 0.2, 3200.0);
insert into Wage
values (2021234, '2019-10', 1000.0, 1000.0, 1000.0, 1000.0, 0.2, 3200.0);
insert into Wage
values (2021235, '2019-10', 1000.0, 1000.0, 1000.0, 1000.0, 0.2, 3200.0);
insert into Wage
values (3011234, '2019-10', 1000.0, 1000.0, 1000.0, 1000.0, 0.2, 3200.0);
insert into Wage
values (3021234, '2019-10', 1000.0, 1000.0, 1000.0, 1000.0, 0.2, 3200.0);
insert into Wage
values (3021235, '2019-10', 1000.0, 1000.0, 1000.0, 1000.0, 0.2, 3200.0);
insert into Wage
values (2011111, '2019-10', 1000.0, 1000.0, 1000.0, 1000.0, 0.2, 3200.0);
insert into Wage
values (2011112, '2019-10', 1000.0, 1000.0, 1000.0, 1000.0, 0.2, 3200.0);

insert into CheckT
values (null, 2011234, '2019-10-11', 1);
insert into CheckT
values (null, 1011234, '2019-10-11', 1);
insert into CheckT
values (null, 2011234, '2019-10-11', 1);
insert into CheckT
values (null, 2011235, '2019-10-11', 1);
insert into CheckT
values (null, 2021234, '2019-10-11', 1);
insert into CheckT
values (null, 3011234, '2019-10-11', 1);
insert into CheckT
values (null, 2011234, '2019-10-11', 1);
insert into CheckT
values (null, 3021234, '2019-10-11', 1);
insert into CheckT
values (null, 3021234, '2019-10-11', 1);
insert into CheckT
values (null, 3021235, '2019-10-11', 1);
insert into CheckT
values (null, 1021234, '2020-05-4', 0);
insert into CheckT
values (null, 1021234, '2020-05-5', 0);
insert into CheckT
values (null, 1021234, '2020-04-5', 2);
insert into CheckT
values (null, 3011234, '2020-04-5', 4);
insert into CheckT
values (null, 3011234, '2020-04-5', 3);

insert into Slrcd
values (null, 1011234, 1, 10, 123.0, '2019-10-12');
insert into Slrcd
values (null, 1011234, 1, 10, 123.0, '2019-10-12');
insert into Slrcd
values (null, 1021234, 2, 11, 123.0, '2019-10-13');
insert into Slrcd
values (null, 2011234, 2, 11, 123.0, '2019-10-13');
insert into Slrcd
values (null, 2011235, 2, 11, 123.0, '2019-10-13');
insert into Slrcd
values (null, 2021234, 2, 11, 123.0, '2019-10-13');
insert into Slrcd
values (null, 2021234, 2, 11, 123.0, '2019-10-13');
insert into Slrcd
values (null, 2021235, 2, 11, 123.0, '2019-10-13');
insert into Slrcd
values (null, 3021234, 2, 11, 123.0, '2019-10-13');
insert into Slrcd
values (null, 3021234, 2, 11, 123.0, '2019-10-13');
insert into Slrcd
values (null, 3021234, 2, 11, 123.0, '2019-10-13');
insert into Slrcd
values (null, 3021234, 2, 11, 123.0, '2019-10-13');
insert into Slrcd
values (null, 3021234, 2, 11, 123.0, '2019-10-13');
insert into Slrcd
values (null, 3021234, 2, 11, 123.0, '2019-10-13');
insert into Slrcd
values (null, 3021235, 2, 11, 123.0, '2019-10-13');

insert into SlTsk
values (1, 1011234, 2011234, '测试任务', 10000.0, '2019-10-13', '2019-10-14');

insert into resume
values (1011234, '本科', '团员', 178, '江西省南昌市', '1997-01-07', '362330199701071234', '南昌航空大学前湖校区', '13175647892', '333100',
        '南昌航空大学', '2019-06-07', '软件工程', '敲代码');
insert into resume
values (1021234, '大专', '群众', 178, '江西省上饶市', '1996-02-08', '362333199602083645', '上饶市信州区', '18875847553', '333100',
        '南昌理工学院', '2018-07-09', '计算机与科学', '钓鱼');
insert into resume
values (2011234, '本科', '团员', 178, '江西省南昌市', '1997-01-07', '362330199701071234', '南昌航空大学', '13175647892', '333100',
        '南昌航空大学', '2019-06-07', '软件工程', '敲代码');
insert into resume
values (2011235, '本科', '预备党员', 169, '江西省上饶市', '2000-01-07', '362330200001071234', '江西科技师范大学', '13112345678', '333100',
        '江西科技师范大学', '2019-06-07', '软件工程', '唱歌');
insert into resume
values (2021234, '本科', '党员', 177, '江西省赣州市', '1997-01-07', '362330199701071234', '南昌大学', '13111111111', '333100', '南昌大学',
        '2019-06-07', '土木建筑工程', '跳舞');
insert into resume
values (2021235, '本科', '群众', 180, '上海市', '1997-01-07', '362330199701071234', '南昌航空大学', '13122222222', '333100',
        '南昌航空大学', '2019-06-07', '工商管理', 'rap');
insert into resume
values (3011234, '本科', '党员', 174, '北京市', '1997-01-07', '362330199701071234', '赣南师范学院', '13133333333', '333100',
        '赣南师范学院', '2019-06-07', '民航管理', '打篮球');
insert into resume
values (3021234, '本科', '团员', 175, '广东省广州市', '1997-01-07', '362330199701071234', '南昌大学', '13144444444', '333100', '南昌大学',
        '2019-06-07', '嵌入式', '古筝');
insert into resume
values (2021235, '本科', '预备党员', 178, '湖南省长沙市', '1997-01-07', '362330199701071234', '华东交通大学', '13155555555', '333100',
        '华东交通大学', '2019-06-07', '金属材料工程', '轮滑');
insert into resume
values (2011111, '本科', '团员', 170, '江西省南昌市', '1997-01-07', '362330199701071234', '南昌航空大学', '13166666666', '333100',
        '南昌航空大学', '2019-06-07', '软件工程', '看小说');

select *
from AsT;
select *
from CheckT;
select *
from Dptm;
select *
from Good;
select *
from Position;
select *
from Slrcd;
select *
from SlTsk;
select *
from Tax;
select *
from User;
select *
from Wage;
select *
from resume;