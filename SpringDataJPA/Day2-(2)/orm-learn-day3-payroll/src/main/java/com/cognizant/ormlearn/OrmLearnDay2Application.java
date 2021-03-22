package com.cognizant.ormlearn;



import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.cognizant.ormlearn.model.Department;
import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.model.Skill;
import com.cognizant.ormlearn.service.DepartmentService;
import com.cognizant.ormlearn.service.EmployeeService;
import com.cognizant.ormlearn.service.SkillService;


@SpringBootApplication
@ComponentScan("com.*")
public class OrmLearnDay2Application {

	@Autowired
	private static EmployeeService employeeService;
	
	@Autowired
	private static DepartmentService departmentService;
	
	@Autowired
	private static SkillService skillService;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnDay2Application.class);
	public static void main(String[] args) throws ParseException {
		
		ApplicationContext context = SpringApplication.run(OrmLearnDay2Application.class, args);

		departmentService = context.getBean(DepartmentService.class);
		employeeService = context.getBean(EmployeeService.class);
		
		skillService = context.getBean(SkillService.class);
		
//		testGetEmployee();
//		testAddEmployee();
//		testUpdateEmployee();
//		testGetDepartment();
//		testAddSkillToEmployee();
		
//		testGetAllPermanentEmployees();
		
//		testAverageSalary();
		
		testGetAllEmployeesNative();
	}
	
	/*
	private static void testGetEmployee() {

		LOGGER.info("Start");

		Employee employee = employeeService.get(1);

		LOGGER.debug("Employee:{}", employee);

		LOGGER.debug("Department:{}", employee.getDepartment());

		LOGGER.debug("Skills:{}", employee.getSkillList());
		
		LOGGER.info("End");

		}
	
	private static void testAddEmployee() throws ParseException {

		LOGGER.info("Start");

		Employee employee = new Employee();
		employee.setName("Joe");
		employee.setSalary(new BigDecimal("20000.00"));
		employee.setPermanent(false);
		DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Date dateOfBirth = sdf.parse("1987-11-01");
		employee.setDateOfBirth(dateOfBirth);

		employee.setDepartment(departmentService.get(1));
		
		employeeService.save(employee);
		LOGGER.debug("Employee:{}", employee);

		LOGGER.debug("Department:{}", employee.getDepartment());

		
		LOGGER.info("End");

		}
/*
	private static void testUpdateEmployee() {

		LOGGER.info("Start");

		Employee employee = employeeService.get(4);
		
		employee.setDepartment(departmentService.get(2));
		
		employeeService.save(employee);
		LOGGER.debug("Employee:{}", employee);

		LOGGER.debug("Department:{}", employee.getDepartment());

		LOGGER.info("End");

		}
	
	
	private static void testGetDepartment() {
		Department department = departmentService.get(1);
		
		LOGGER.info("Start");
		
		LOGGER.debug("Department:{}",department);
		LOGGER.debug("EmployeeList:{}",department.getEmployeeList());
		
		LOGGER.info("End");
	}
	
	private static void testAddSkillToEmployee() {
		Employee employee = employeeService.get(5);
		Skill skill = skillService.get(2);
		
		employee.getSkillList().add(skill);
		
		employeeService.save(employee);
	}
	*/
	public static void testGetAllPermanentEmployees() {

		LOGGER.info("Start");

		List<Employee> employees = employeeService.getAllPermanentEmployees();

		LOGGER.debug("Permanent Employees:{}", employees);

		employees.forEach(e -> LOGGER.debug("Skills:{}", e.getSkillList()));

		LOGGER.info("End");

		}
	
	/*
	public static void testAverageSalaryOfAllEmployee() {
		
		LOGGER.info("Start");

		double salary = employeeService.getAverageSalary();
		LOGGER.debug("salary: ",salary);
		
		LOGGER.info("End");
	}*/
	
public static void testAverageSalary() {
		
		LOGGER.info("Start");

		double salary = employeeService.getAverageSalary();
		LOGGER.debug("salary:{}",salary);
		
		LOGGER.info("End");
	}

public static void testGetAllEmployeesNative() {
	
	LOGGER.info("Start");

	List<Employee> employees = employeeService.getAllEmployeesNative();

	LOGGER.debug("Employees:{}", employees);
	
	LOGGER.info("End");
}



}
