package junittestcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculateNetSalaryTest {

	@Test
	void calculatingNetSalary() {
		CalculateNetSalary c = new CalculateNetSalary();
		double basic_salary = 60000;
		double tax = 6000;
		double insurence = 10000;
		double net_salary = basic_salary - (tax+insurence);
		assertEquals(44000, net_salary);
	}
}
