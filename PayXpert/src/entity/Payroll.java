package entity;

import java.time.LocalDate;

public class Payroll {
    private int payrollID;
    private int employeeID; 
    private LocalDate payPeriodStartDate;
    private LocalDate payPeriodEndDate;
    private double basicSalary;
    private double overtimePay;
    private double deductions;
    public static double netSalary;

    // Default constructor
    public Payroll() {
    }

    // Parametrized constructor
    public Payroll(int payrollID, int employeeID, LocalDate payPeriodStartDate,
                   LocalDate payPeriodEndDate, double basicSalary, double overtimePay,
                   double deductions) {
        this.payrollID = payrollID;
        this.employeeID = employeeID;
        this.payPeriodStartDate = payPeriodStartDate;
        this.payPeriodEndDate = payPeriodEndDate;
        this.basicSalary = basicSalary;
        this.overtimePay = overtimePay;
        this.deductions = deductions;
        this.calculateNetSalary(); // Calculate net salary 
    }

    // Getter and Setter methods for all properties

    public int getPayrollID() {
        return payrollID;
    }

    public void setPayrollID(int payrollID) {
        this.payrollID = payrollID;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public LocalDate getPayPeriodStartDate() {
        return payPeriodStartDate;
    }

    public void setPayPeriodStartDate(LocalDate payPeriodStartDate) {
        this.payPeriodStartDate = payPeriodStartDate;
    }

    public LocalDate getPayPeriodEndDate() {
        return payPeriodEndDate;
    }

    public void setPayPeriodEndDate(LocalDate payPeriodEndDate) {
        this.payPeriodEndDate = payPeriodEndDate;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
        calculateNetSalary(); // Recalculate net salary when basic salary is updated
    }

    public double getOvertimePay() {
        return overtimePay;
    }

    public void setOvertimePay(double overtimePay) {
        this.overtimePay = overtimePay;
        calculateNetSalary(); // Recalculate net salary when overtime pay is updated
    }

    public double getDeductions() {
        return deductions;
    }

    public void setDeductions(double deductions) {
        this.deductions = deductions;
        calculateNetSalary(); // Recalculate net salary when deductions are updated
    }

    public double getNetSalary() {
        return netSalary;
    }

    // Method to calculate net salary based on basic salary, overtime pay, and deductions
    private void calculateNetSalary() {
        this.netSalary = basicSalary + overtimePay - deductions;
    }
}
