package entity;

import java.time.LocalDate;

public class Tax {
	private int TaxID;
	private int EmployeeID;
	private LocalDate TaxYear;
	private double TaxableIncome;
	private double TaxAmount;
	
	public Tax()
	{
		
	}
	
	public Tax(int TaxID,int EmployeeID,LocalDate TaxYear,double TaxableIncome,double TaxAmount) {
		this.TaxID=TaxID;
		this.EmployeeID=EmployeeID;
		this.TaxYear=TaxYear;
		this.TaxableIncome=TaxableIncome;
		this.TaxAmount=TaxAmount;
	}
	
	public int getTaxID() {
		return TaxID;
	}
	
	public void setTaxID(int TaxID) {
		this.TaxID = TaxID;
	}
	
	public int getEmployeeID()
	{
		return EmployeeID;
	}
	
	public void setEmployeeID(int EmployeeID) {
		this.EmployeeID=EmployeeID;
	}
	
	public LocalDate getTaxYear()
	{
		return TaxYear;
	}
	
	public void setTaxYear(LocalDate TaxYear) {
		this.TaxYear=TaxYear;
	}
	
	public double getTaxableIncome() {
		return TaxableIncome;
	}
	
	public void setTaxableIncome(double TaxableIncome) {
		this.TaxableIncome=TaxableIncome;
	}
	
	public double getTaxAmount()
	{
		return TaxAmount;
	}
	
	public void setTaxAmount(double TaxAmount) {
		this.TaxAmount=TaxAmount;
	}
}


