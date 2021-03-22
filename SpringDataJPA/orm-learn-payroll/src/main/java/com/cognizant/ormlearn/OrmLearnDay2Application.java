package com.cognizant.ormlearn;



import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
		testAddSkillToEmployee();
	}
	
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
		employee.setName("John");
		employee.setSalary(new BigDecimal("25000.00"));
		employee.setPermanent(true);
		DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Date dateOfBirth = sdf.parse("1988-09-31");
		employee.setDateOfBirth(dateOfBirth);

		employee.setDepartment(departmentService.get(1));
		
		employeeService.save(employee);
		LOGGER.debug("Employee:{}", employee);

		LOGGER.debug("Department:{}", employee.getDepartment());

		
		LOGGER.info("End");

		}

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
		Employee employee = employeeService.get(2);
		Skill skill = skillService.get(1);
		
		employee.getSkillList().add(skill);
		
		employeeService.save(employee);
	}
}
