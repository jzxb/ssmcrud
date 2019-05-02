package org.lhx.crud.service;

import org.lhx.crud.bean.Employee;
import org.lhx.crud.bean.EmployeeExample;
import org.lhx.crud.bean.Msg;
import org.lhx.crud.dao.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lhx
 * @date 2019/4/23 - 16:04
 */
@Service
public class EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;

    public List<Employee> getAll() {
        return employeeMapper.selectByExampleWithDept(null);
    }


    public Boolean checkUser(String empName) {
        EmployeeExample example = new EmployeeExample();
        EmployeeExample.Criteria criteria = example.createCriteria();
        criteria.andEmpNameEqualTo(empName);
        long l = employeeMapper.countByExample(example);
        return l == 0;
    }

    public void saveEmp(Employee employee) {
        employeeMapper.insertSelective(employee);
    }
}
