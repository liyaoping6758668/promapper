package com.ping.mapper.entities;

/**
 * @author:lyp
 * @date 2020/2/13-10:21
 * 员工实体类
 */
public class Employee {
    private Integer empid;
    private String empName;
    private Double empSalary;
    private Integer empAge;

    //无参构造
    public Employee() {
    }

    //有参构造
    public Employee(Integer empid, String empName, Double empSalary, Integer empAge) {
        this.empid = empid;
        this.empName = empName;
        this.empSalary = empSalary;
        this.empAge = empAge;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", empName='" + empName + '\'' +
                ", empSalary=" + empSalary +
                ", empAge=" + empAge +
                '}';
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(Double empSalary) {
        this.empSalary = empSalary;
    }

    public Integer getEmpAge() {
        return empAge;
    }

    public void setEmpAge(Integer empAge) {
        this.empAge = empAge;
    }
}
