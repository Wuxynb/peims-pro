package com.example.peims.service.impl;

import com.example.peims.mapper.CheckMapper;
import com.example.peims.model.CheckQuery;
import com.example.peims.model.UserQuery;
import com.example.peims.pojo.Check;
import com.example.peims.service.CheckService;
import com.example.peims.util.AssertUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CheckServiceImpl implements CheckService {

    @Autowired
    private CheckMapper checkMapper;

    @Cacheable(value = "checks", key = "'allChecks'")
    public List<Check> getAllChecks() {

        return checkMapper.queryAllChecks();
    }

    @Override
    @Cacheable(value = "checks", key = "#cid")
    public Check queryCheckByCid(Long cid) {

        return checkMapper.queryCheckByCId(cid);
    }

    @Override
    public PageInfo<Check> queryCheckByUsername(UserQuery userQuery) {
        PageHelper.startPage(userQuery.getPageNum(), userQuery.getPageSize());

        return new PageInfo<>(checkMapper.queryCheckByUsername(userQuery.getUser_Name_s()));
    }

    @Override
    public PageInfo<Check> queryCheckByParams(CheckQuery checkQuery) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
//    @CachePut(value = "checks", key = "#check.PK_FK_Check_Id_nb+'-'+check.as_id_n")
    public int insertCheck(Check check) {
        int row = checkMapper.insertOneCheck(check);
        AssertUtil.isTrue(row <= 0, "增加考勤记录失败！");

        return row;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    @CachePut(value = "checks", key = "#check.PK_FK_Check_Id_nb+'-'+check.PK_Check_Date_dt")
    public Check updateCheck(Check check) {
        int row = checkMapper.updateOneCheck(check);
        AssertUtil.isTrue(row <= 0, "更新考勤记录失败！");

        return queryCheckByCid(check.getPK_Check_Id_n());
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    @CacheEvict(value = "users", key = "#cid")
    public int deleteCheck(Long cid) {

        return checkMapper.deleteOneCheck(cid);
    }
}
