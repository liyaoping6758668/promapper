package com.ping.mapper.service.impl;

import com.ping.mapper.entities.Employee;
import com.ping.mapper.mappers.EmployeeMapper;
import com.ping.mapper.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author:lyp
 * @date 2020/2/14-20:54
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;


    @Override
    public Employee getOne(Employee employeeQueryCondition) {
        Employee employee = employeeMapper.selectOne(employeeQueryCondition);
        return employee;
    }
}
