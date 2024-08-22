package junittestcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import entity.Employee;
import exception.InvalidInputException;

class InvalidEmployeeDataTest {
	@Test
	public void testemployeeData() {
		String name = "12@shyam";
		String employeename="Shyam";
		assertEquals("Shyam",employeename); //Test case passed
		assertEquals("Shyam",name); //Test case Failed
		
	}
//	EmployeeService employeeService = new EmployeeService();
//    Employee invalidEmployee = new Employee("shyam"); 
//    
//    try {
//        
//        employeeService.addEmployee(invalidEmployee);
//
//        
//        fail("Expected InvalidInputException but no exception was thrown.");
//    } catch (InvalidInputException e) {
//        
//        System.out.println("Invalid employee data.");
//    }
    
}
