package org.lhx.crud.service;

import org.lhx.crud.bean.Department;
import org.lhx.crud.dao.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lhx
 * @date 2019/5/2 - 19:03
 */
@Service
public class DeptService {

    @Autowired
    private DepartmentMapper departmentMapper;

    public List<Department> getDepts() {
        List<Department> departmentList = departmentMapper.selectByExample(null);
        return departmentList;
    }
}
