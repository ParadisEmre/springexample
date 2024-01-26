package com.javacodegeeks.snippets.enterprise;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javacodegeeks.snippets.enterprise.model.Employee;
import com.javacodegeeks.snippets.enterprise.service.EmployeeService;

public class App {

	public static void main(String[] args) {
		System.out.println("load context");
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee em = new Employee();
		em.setId("123");
		em.setName("John");
		em.setAge(35);
		EmployeeService emService = (EmployeeService) context.getBean("employeeService");
		emService.persistEmployee(em);
		System.out.println("Updated age :" + emService.findEmployeeById("123").getAge());
		em.setAge(32);
		emService.updateEmployee(em);
		System.out.println("Updated age :" + emService.findEmployeeById("123").getAge());
		//emService.deleteEmployee(em);
		context.close();
	}

}
