package junittestcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class EmployeeServiceTest {

	@Test
    public void testCalculateGrossSalaryForEmployee() {
        // Arrange
        EmployeeService employeeService = new EmployeeService();
        double basic_salary = 10000;
        double salary = basic_salary + 5000;
        assertEquals(15000, salary);
    }


}
