package junittestcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VerifyTaxCalculationTest {

	@Test
	public void taxcalculation() {
		VerifyTaxCalculation t = new VerifyTaxCalculation();
		double employeeSalary=120000;
		double tax = 0.1; //Tax 10% 
		double caluculateTax=employeeSalary*tax;
		assertEquals(12000,caluculateTax);
	}

}
