package entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

public class Employee {
    private int employeeID;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String gender;
    private String email;
    private String phoneNumber;
    private String address;
    private String position;
    private LocalDate joiningDate;
    private LocalDate terminationDate;

    // Default constructor
    public Employee(String name) {
    	this.firstName = name;
    }

    // Parametrized constructor
    public Employee(int employeeID, String firstName, String lastName, LocalDate dateOfBirth,
                    String gender, String email, String phoneNumber, String address,
                    String position, LocalDate joiningDate, LocalDate terminationDate) {
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.position = position;
        this.joiningDate = joiningDate;
        this.terminationDate = terminationDate;
    }

    // Getter and Setter methods for all properties

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(LocalDate joiningDate) {
        this.joiningDate = joiningDate;
    }

    public LocalDate getTerminationDate() {
        return terminationDate;
    }

    public void setTerminationDate(LocalDate terminationDate) {
        this.terminationDate = terminationDate;
    }

    // Method to calculate age
    public int calculateAge() {
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(dateOfBirth, currentDate);
        return period.getYears();
    }
    
    public static void main(String [] args)
    {
    	Employee e = new Employee(123, "Shyam", "Kumar", LocalDate.of(1990, 5, 15), "Male", "shyam@example.com", "1234567890", "123 Main St", "Developer", LocalDate.of(2022, 1, 1), null);
    	System.out.println("The employee id is "+e.getEmployeeID());
    }

	public void setBasicSalary(BigDecimal bigDecimal) {
		// TODO Auto-generated method stub
		
	}

	public Object getDeductions() {
		// TODO Auto-generated method stub
		return null;
	}
    
    
}
