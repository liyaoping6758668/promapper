package com.ping.mapper.service;

import com.ping.mapper.entities.Employee; /**
 * @author:lyp
 * @date 2020/2/14-20:53
 */
public interface EmployeeService {
    Employee getOne(Employee employeeQueryCondition);

    Employee getEmployeeById(Integer empid);


    void saveEmployee(Employee employee);

    void saveEmployeeSelective(Employee employee);

    void updateEmployeeSelective(Employee employee);
}
