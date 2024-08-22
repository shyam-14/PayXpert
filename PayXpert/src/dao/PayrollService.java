package dao;

import entity.Payroll;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PayrollService implements IPayrollService {
    private List<Payroll> payrollList;

    public PayrollService() {
        // Initialize the payrollList in the constructor
        this.payrollList = new ArrayList<>();
    }

    @Override
    public void generatePayroll(Payroll payroll) {
        //  logic to generate and add a payroll entry
        payrollList.add(payroll);
    }

    @Override
    public Payroll getPayrollById(int payrollID) {
        //  logic to retrieve a payroll entry by ID
        for (Payroll payroll : payrollList) {
            if (payroll.getPayrollID() == payrollID) {
                return payroll;
            }
        }
        return null; // Return null if payroll with the given ID is not found
    }

    @Override
    public List<Payroll> getPayrollsForEmployee(int employeeID) {
        //  logic to retrieve all payrolls for a specific employee
        List<Payroll> employeePayrolls = new ArrayList<>();
        for (Payroll payroll : payrollList) {
            if (payroll.getEmployeeID() == employeeID) {
                employeePayrolls.add(payroll);
            }
        }
        return employeePayrolls;
    }

    @Override
    public List<Payroll> getPayrollsForPeriod(LocalDate startDate, LocalDate endDate) {
        //  logic to retrieve all payrolls within a specified period
        List<Payroll> periodPayrolls = new ArrayList<>();
        for (Payroll payroll : payrollList) {
            LocalDate payrollEndDate = payroll.getPayPeriodEndDate();
            if (payrollEndDate.isAfter(startDate) || payrollEndDate.isEqual(startDate)) {
                if (payrollEndDate.isBefore(endDate) || payrollEndDate.isEqual(endDate)) {
                    periodPayrolls.add(payroll);
                }
            }
        }
        return periodPayrolls;
    }
}
