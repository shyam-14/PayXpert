package dao;

import java.util.List;

import entity.Employee;

public interface IEmployeeService {

	Employee getEmployeeById(int employeeID);

	List<Employee> getAllEmployees();

	void addEmployee(Employee addEmployee);

	void updateEmployee(Employee updatedEmployee);
	
	void removeEmployee(int employeeID);
}
