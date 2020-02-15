package com.ping.mapper;

import com.ping.mapper.entities.Employee;
import com.ping.mapper.service.EmployeeService;
import com.ping.mapper.service.impl.EmployeeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class EmployeeMapperTest {
	
	private ApplicationContext iocContainer = new ClassPathXmlApplicationContext("spring-context.xml");
	private EmployeeService employeeService = (EmployeeService) iocContainer.getBean("employeeServiceImpl");

	@Test
	public void testSelectOne() {
		
		//1.创建封装查询条件的实体类对象
		Employee employeeQueryCondition = new Employee(null, "bob", 5560.11, null);
		
		//2.执行查询
		Employee employeeQueryResult = employeeService.getOne(employeeQueryCondition);
		
		//3.打印
		System.out.println(employeeQueryResult);
	}

	@Test
	public void testSelect() {
		
	}

	@Test
	public void testSelectAll() {
		
	}

	@Test
	public void testSelectCount() {
		
	}

	@Test
	public void testSelectByPrimaryKey() {
		Integer empid=3;
		Employee employee=employeeService.getEmployeeById(empid);
		System.out.println(employee);
	}

	@Test
	public void testExistsWithPrimaryKey() {

		
	}

	@Test
	public void testInsert() {
		Employee employee=new Employee(null,"李耀平",5000.00,23);
		employeeService.saveEmployee(employee);
		//获取插入数据生成的主键,复制到实体类需要配置注解
		Integer empId = employee.getEmpId();
		System.out.println(empId);
	}

	//除了主键外空的值不插入
	@Test
	public void testInsertSelective() {
		Employee employee=new Employee(null,"李耀平",6000.00,null);
		employeeService.saveEmployeeSelective(employee);

		
	}


	@Test
	public void testUpdateByPrimaryKey() {
		Employee employee=new Employee(null,"李耀平",6000.00,null);
		employeeService.saveEmployeeSelective(employee);
	}
	//除了主键外空的值不更新
	@Test
	public void testUpdateByPrimaryKeySelective() {
		Employee employee=new Employee(6,"888李耀平",888.00,66);
		employeeService.updateEmployeeSelective(employee);
	}

	@Test
	public void testDelete() {
		

		
	}

	@Test
	public void testDeleteByPrimaryKey() {

		
	}

	@Test
	public void testSelectByExample() {
		

	}

	@Test
	public void testSelectOneByExample() {
		
	}

	@Test
	public void testSelectCountByExample() {
		
	}

	@Test
	public void testDeleteByExample() {
		
	}

	@Test
	public void testUpdateByExample() {
		
	}

	@Test
	public void testUpdateByExampleSelective() {
		
	}

	@Test
	public void testSelectByExampleAndRowBounds() {
		
	}

	@Test
	public void testSelectByRowBounds() {
		

		
	}

}
