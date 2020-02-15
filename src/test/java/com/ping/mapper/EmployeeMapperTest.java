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
		

		
	}

	@Test
	public void testExistsWithPrimaryKey() {

		
	}

	@Test
	public void testInsert() {
		

		
	}

	@Test
	public void testInsertSelective() {
		

		
	}

	@Test
	public void testUpdateByPrimaryKey() {
		
	}

	@Test
	public void testUpdateByPrimaryKeySelective() {
		

		
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
