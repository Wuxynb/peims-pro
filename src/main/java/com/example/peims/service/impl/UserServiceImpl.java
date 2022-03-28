package com.example.peims.service.impl;

import com.example.peims.mapper.UserMapper;
import com.example.peims.model.ResultModel;
import com.example.peims.model.UserQuery;
import com.example.peims.pojo.User;
import com.example.peims.service.UserService;
import com.example.peims.util.AssertUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    @Cacheable(value = "users", key = "'allUsers'")
    public List<User> getAllUsers() {
        System.out.println("execute getAllUser().");
        return userMapper.getAllUsers();
    }

    @Override
    @Cacheable(value = "pages", key = "#userQuery.user_Name_s+'-'+#userQuery.pageNum+'-'+#userQuery.pageSize")
    public PageInfo<User> queryUsersByUsername(@RequestBody UserQuery userQuery) {
        System.out.println("execute queryUsersByUsername().");
        PageHelper.startPage(userQuery.getPageNum(), userQuery.getPageSize());

        return new PageInfo<>(userMapper.queryUsersByUsername(userQuery.getUser_Name_s()));
    }

    @Override
    @Cacheable(value = "users", key = "#userId")
    public User queryUserById(Integer userId) {

        return userMapper.queryUserById(userId);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    @CachePut(value = "users", key = "#newUser.PK_User_Id_nb")
    public User updateUser(User newUser) {
        int row = userMapper.updateUser(newUser);
        AssertUtil.isTrue(row <= 0, "更新失败！");
        return userMapper.queryUserById(newUser.getPK_User_Id_nb());
    }

    @Override
    @Cacheable(value = "users", key = "#user.PK_User_Id_nb")
    @Transactional(propagation = Propagation.REQUIRED)
    public User insertUser(User user) {
        int row = userMapper.insertUser(user);
        if (row == 0) throw new RuntimeException();

        return user;
    }

    @Override
    @CacheEvict(value = "users", key = "#userId", allEntries = true)
    @Transactional(propagation = Propagation.REQUIRED)
    public ResultModel deleteUser(Integer userId) {
        ResultModel resultModel = new ResultModel();
        if (userMapper.deleteUser(userId) > 0) {
            resultModel.setMsg("删除成功！");
        } else {
            resultModel.setMsg("删除失败！");
        }

        return resultModel;
    }
}
