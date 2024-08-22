package dao;
import entity.Payroll;

import entity.Employee;
import exception.InvalidInputException;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class EmployeeService implements IEmployeeService {
    private List<Employee> employeeList;

    public EmployeeService() {
        // Initialize the employeeList in the constructor
        this.employeeList = new ArrayList<>();
    }

    @Override
    public Employee getEmployeeById(int employeeID) {
        //logic to retrieve an employee by ID
        for (Employee employee : employeeList) {
            if (employee.getEmployeeID() == employeeID) {
                return employee;
            }
        }
        return null; // Return null if employee with the given ID is not found
    }

    @Override
    public List<Employee> getAllEmployees() {
        // Return the list of all employees
        return new ArrayList<>(employeeList);
    }

    
    @Override
    public void addEmployee(Employee employee){
        // Validate input data before processing
    	employeeList.add(employee);
    	try {
    		
	    	if(employee==null) {
	    		throw new InvalidInputException("Invalid employee data.");
	    	}
    	}
    	catch (InvalidInputException e)
    	{
    		System.out.println("Invalid employee data.");
    	}
        
    }
    

    @Override
    public void updateEmployee(Employee updatedEmployee) {
        // logic to update an existing employee in the employeeList
        int index = -1;
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getEmployeeID() == updatedEmployee.getEmployeeID()) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            employeeList.set(index, updatedEmployee);
        }
    }

    @Override
    public void removeEmployee(int employeeID) {
        //logic to remove an employee by ID from the employeeList
        employeeList.removeIf(employee -> employee.getEmployeeID() == employeeID);
    }

	public decimal CalculateGrossSalaryForEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	public BigDecimal calculateNetSalaryAfterDeductions(Employee employee) {
		// TODO Auto-generated method stub
		try {
			return Payroll.netSalary;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

