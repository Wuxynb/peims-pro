package com.example.peims.restcontroller;

import com.example.peims.model.ResultModel;
import com.example.peims.model.UserQuery;
import com.example.peims.pojo.Check;
import com.example.peims.service.CheckService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class CheckRestController {

    @Autowired
    private CheckService checkService;

    @GetMapping("checks")
    public ResultModel getAllChecks() {
        ResultModel resultModel = new ResultModel();
        List<Check> checks = checkService.getAllChecks();
        resultModel.setCode(0);
        resultModel.setMsg("查询所有考勤成功！");
        resultModel.setCount(checks.size());
        resultModel.setData(checks);

        return resultModel;
    }

    @GetMapping("check/{cid}")
    public ResultModel queryCheckByCid(@PathVariable(value = "cid") Long cid) {
        ResultModel resultModel = new ResultModel();
        Check check = checkService.queryCheckByCid(cid);
        resultModel.setCode(0);
        resultModel.setMsg("查询一条考勤记录成功！");
        resultModel.setData(check);
        resultModel.setCount(1);

        return resultModel;
    }

    @RequestMapping("checks/query")
    public ResultModel queryChecksByUsername(UserQuery userQuery) {
        System.out.println(userQuery);
        ResultModel resultModel = new ResultModel(1, "", 0, null);

        PageInfo<Check> pageInfo = checkService.queryCheckByUsername(userQuery);
        resultModel.setCode(0);
        resultModel.setCount((int) pageInfo.getTotal());
        resultModel.setData(pageInfo.getList());
        System.out.println(pageInfo.getList().size());
        return resultModel;
    }

    @PostMapping("check")
    public ResultModel insertCheck(@RequestBody Check check) {
        System.out.println(check);
        ResultModel resultModel = new ResultModel(1, "插入考勤记录失败！", 0, null);
        int row = checkService.insertCheck(check);
        resultModel.setCount(0);
        resultModel.setMsg("插入考勤记录成功！");
        resultModel.setCount(row);
        resultModel.setData(check);

        return resultModel;
    }
}
