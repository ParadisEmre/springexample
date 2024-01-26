package com.javacodegeeks.snippets.enterprise.service;

import com.javacodegeeks.snippets.enterprise.model.Employee;

public interface EmployeeService {

	void persistEmployee(Employee employee);
	 
    Employee findEmployeeById(String id);
 
    void updateEmployee(Employee employee);
 
    void deleteEmployee(Employee employee);
}
