package com.ping.mapper.service.impl;

import com.ping.mapper.entities.Employee;
import com.ping.mapper.mappers.EmployeeMapper;
import com.ping.mapper.service.EmployeeService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

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

    @Override
    public Employee getEmployeeById(Integer empid) {
        Employee employee = employeeMapper.selectByPrimaryKey(empid);
        return employee;
    }

    @Override
    public void saveEmployee(Employee employee) {
        employeeMapper.insert(employee);
    }

    @Override
    public void saveEmployeeSelective(Employee employee) {
        employeeMapper.insertSelective(employee);
    }

    @Override
    public void updateEmployeeSelective(Employee employee) {
        employeeMapper.updateByPrimaryKeySelective(employee);
    }

    @Override
    public void deleteByPrimaryKey(Integer empid) {
        employeeMapper.deleteByPrimaryKey(empid);
    }

    @Override
    public List<Employee> getEmpListByExample(Example example) {
        List<Employee> employees = employeeMapper.selectByExample(example);
        return employees;
    }

    @Override
    public List<Employee> getEmpListByRowBounds(RowBounds rowBounds) {
        List<Employee> employees = employeeMapper.selectByRowBounds(null, rowBounds);
        return employees;
    }


}
