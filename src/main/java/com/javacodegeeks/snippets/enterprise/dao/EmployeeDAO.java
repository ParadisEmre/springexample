package com.javacodegeeks.snippets.enterprise.dao;

import com.javacodegeeks.snippets.enterprise.model.Employee;

public interface EmployeeDAO {

	void persistEmployee(Employee employee);

	Employee findEmployeeById(String id);

	void updateEmployee(Employee employee);

	void deleteEmployee(Employee employee);
}
