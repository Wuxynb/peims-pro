package com.example.peims.service;

import com.example.peims.model.ResultModel;
import com.example.peims.model.UserQuery;
import com.example.peims.pojo.User;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface UserService {

    public List<User> getAllUsers();

    public PageInfo<User> queryUsersByUsername(UserQuery userQuery);

    public User queryUserById(Integer userId);

    public User updateUser(User newUser);

    public User insertUser(User user);

    public ResultModel deleteUser(Integer userId);
}
