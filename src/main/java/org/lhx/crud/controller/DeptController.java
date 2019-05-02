package org.lhx.crud.controller;

import org.lhx.crud.bean.Department;
import org.lhx.crud.bean.Msg;
import org.lhx.crud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author lhx
 * @date 2019/5/2 - 19:01
 */
@Controller
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping("/depts")
    @ResponseBody
    public Msg getDepts(){
        List<Department> departmentList = deptService.getDepts();
        return Msg.success().add("depts",departmentList);
    }

}
