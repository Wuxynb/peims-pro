package com.example.peims.restcontroller;

import com.example.peims.model.ResultModel;
import com.example.peims.model.UserQuery;
import com.example.peims.pojo.User;
import com.example.peims.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("api/v1/")
public class EmployeeRestController {
    @Autowired
    private UserService service;

    @RequestMapping("employees")
    public ResultModel getAllUsers(){
        List<User> users = service.getAllUsers();

        ResultModel resultModel = new ResultModel();
        resultModel.setCode(0);
        resultModel.setMsg("查询成功！");
        resultModel.setCount(users.size());
        resultModel.setData(users);

        return resultModel;
    }

    @RequestMapping("employees/query")
    public ResultModel queryUsersByUsername(UserQuery userQuery) {
        System.out.println(userQuery);
        ResultModel resultModel = new ResultModel(1, "", 0, null);

        PageInfo<User> pageInfo = service.queryUsersByUsername(userQuery);
        resultModel.setCode(0);
        resultModel.setCount((int) pageInfo.getTotal());
        resultModel.setData(pageInfo.getList());
        System.out.println(pageInfo.getList().size());
        return resultModel;
    }
}
