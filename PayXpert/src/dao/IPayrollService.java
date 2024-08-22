package dao;

import java.time.LocalDate;
import java.util.List;

import entity.Payroll;

public interface IPayrollService {

	void generatePayroll(Payroll payroll);

	Payroll getPayrollById(int payrollID);

	List<Payroll> getPayrollsForEmployee(int employeeID);

	List<Payroll> getPayrollsForPeriod(LocalDate startDate, LocalDate endDate);

}
