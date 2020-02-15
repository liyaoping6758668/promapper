package com.ping.mapper;

import com.ping.mapper.entities.Employee;
import com.ping.mapper.service.EmployeeService;
import org.apache.ibatis.session.RowBounds;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;
import java.util.List;


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

		Integer empid=5;
		employeeService.deleteByPrimaryKey(empid);
		
	}

	@Test
	public void testSelectByExample() {
		//目标：WHERE (emp_salary>? AND emp_age<?) OR (emp_salary<? AND emp_age>?)
		//1.创建Example对象
		Example example = new Example(Employee.class);

		//***********************
		//i.设置排序信息
		example.orderBy("empSalary").asc().orderBy("empAge").desc();

		//ii.设置“去重”
		example.setDistinct(true);

		//iii.设置select字段
		example.selectProperties("empName","empSalary");

		//***********************

		//2.通过Example对象创建Criteria对象
		Criteria criteria01 = example.createCriteria();
		Criteria criteria02 = example.createCriteria();

		//3.在两个Criteria对象中分别设置查询条件
		//property参数：实体类的属性名
		//value参数：实体类的属性值
		criteria01.andGreaterThan("empSalary", 3000)
				.andLessThan("empAge", 25);

		criteria02.andLessThan("empSalary", 5000)
				.andGreaterThan("empAge", 30);

		//4.使用OR关键词组装两个Criteria对象
		example.or(criteria02);

		//5.执行查询
		List<Employee> empList = employeeService.getEmpListByExample(example);

		for (Employee employee : empList) {
			System.out.println(employee);
		}

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

	//sql语句并没有分页，只是内存查询的数据做了分页
	@Test
	public void testSelectByRowBounds() {
		int pageNo = 3;
		int pageSize = 5;

		int index = (pageNo - 1) * pageSize;

		RowBounds rowBounds = new RowBounds(index, pageSize);

		List<Employee> empList = employeeService.getEmpListByRowBounds(rowBounds);
		for (Employee employee : empList) {
			System.out.println(employee);
		}

		
	}

}
