package com.example.peims.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PeimsController {

    @RequestMapping("/index")
    public String index(){

        return "employee_manage";
    }

    @RequestMapping("/employeeEntry")
    public String employeeEntry() {

        return "employee_entry";
    }

    @RequestMapping("/employeeManage")
    public String employeeManage() {

        return "employee_manage";
    }

    @RequestMapping("/employeeUpdate")
    public String employeeUpdate() {

        return "employee_update";
    }

    @RequestMapping("/checkManage")
    public String checkManage() {

        return "check_manage";
    }

    @RequestMapping("/moreInfo")
    public String moreInfo() {

        return "more_info";
    }
}
