SELECT * FROM payxpert_db.employee;

-- 1. Employee Table
CREATE TABLE Employee (
    EmployeeID INT PRIMARY KEY,
    FirstName VARCHAR(255),
    LastName VARCHAR(255),
    DateOfBirth DATE,
    Gender VARCHAR(10),
    Email VARCHAR(255),
    PhoneNumber VARCHAR(20),
    Address VARCHAR(500),
    Position VARCHAR(255),
    JoiningDate DATE,
    TerminationDate DATE
);

-- Sample data for Employee table
INSERT INTO Employee (EmployeeID, FirstName, LastName, DateOfBirth, Gender, Email, PhoneNumber, Address, Position, JoiningDate, TerminationDate)
VALUES 
  (1, 'John', 'Smith', '1985-03-15', 'Male', 'john.smith@email.com', '123-456-7890', 'Cityville', 'Senior Developer', '2020-01-10', '2022-03-20'),
  (2, 'Emily', 'Johnson', '1990-07-22', 'Female', 'emily.j@email.com', '987-654-3210', 'Townsville', 'HR Manager', '2018-05-03', '2023-01-15'),
  (3, 'Michael', 'Davis', '1982-11-08', 'Male', 'michael.d@email.com', '111-222-3333', 'Villagetown', 'Marketing Specialist', '2019-09-12', NULL),
  (4, 'Sarah', 'Miller', '1989-04-30', 'Female', 'sarah.miller@email.com', '555-123-4567', 'Suburbia', 'Financial Analyst', '2021-02-28', NULL),
  (5, 'Kevin', 'Lee', '1995-09-05', 'Male', 'kevin.lee@email.com', '444-555-6666', 'Ruralville', 'IT Support Specialist', '2022-06-08', NULL);

-- displaying the table content

select * from employee;

-- 2. Payroll Table
CREATE TABLE Payroll (
    PayrollID INT PRIMARY KEY,
    EmployeeID INT,
    PayPeriodStartDate DATE,
    PayPeriodEndDate DATE,
    BasicSalary DECIMAL(10, 2),
    OvertimePay DECIMAL(10, 2),
    Deductions DECIMAL(10, 2),
    NetSalary DECIMAL(10, 2),
    FOREIGN KEY (EmployeeID) REFERENCES Employee(EmployeeID)
);

-- Sample data for Payroll table
INSERT INTO Payroll (PayrollID, EmployeeID, PayPeriodStartDate, PayPeriodEndDate, BasicSalary, OvertimePay, Deductions, NetSalary)
VALUES 
  (1, 1, '2022-01-01', '2022-01-15', 5000.00, 200.00, 300.00, 4900.00),
  (2, 2, '2022-01-01', '2022-01-15', 6000.00, 250.00, 350.00, 5900.00),
  (3, 3, '2022-01-01', '2022-01-15', 7000.00, 300.00, 400.00, 6700.00),
  (4, 4, '2022-01-01', '2022-01-15', 5500.00, 180.00, 250.00, 5470.00),
  (5, 5, '2022-01-01', '2022-01-15', 8000.00, 350.00, 500.00, 7850.00);

select * from payroll;

-- 3. Tax Table
CREATE TABLE Tax (
    TaxID INT PRIMARY KEY,
    EmployeeID INT,
    TaxYear INT,
    TaxableIncome DECIMAL(10, 2),
    TaxAmount DECIMAL(10, 2),
    FOREIGN KEY (EmployeeID) REFERENCES Employee(EmployeeID)
);

-- Sample data for Tax table
INSERT INTO Tax (TaxID, EmployeeID, TaxYear, TaxableIncome, TaxAmount)
VALUES 
  (1, 1, 2022, 50000.00, 7500.00),
  (2, 2, 2022, 60000.00, 9000.00),
  (3, 3, 2022, 70000.00, 10500.00),
  (4, 4, 2022, 55000.00, 8250.00),
  (5, 5, 2022, 80000.00, 12000.00);

select * from Tax;

-- 4. FinancialRecord Table
CREATE TABLE FinancialRecord (
    RecordID INT PRIMARY KEY,
    EmployeeID INT,
    RecordDate DATE,
    Description VARCHAR(255),
    Amount DECIMAL(10, 2),
    RecordType VARCHAR(50),
    FOREIGN KEY (EmployeeID) REFERENCES Employee(EmployeeID)
);

-- Sample data for FinancialRecord table
INSERT INTO FinancialRecord (RecordID, EmployeeID, RecordDate, Description, Amount, RecordType)
VALUES 
  (1, 1, '2022-01-05', 'Bonus', 1000.00, 'Income'),
  (2, 2, '2022-01-07', 'Travel Expenses', -200.00, 'Expense'),
  (3, 3, '2022-01-10', 'Overtime Pay', 150.00, 'Income'),
  (4, 4, '2022-01-12', 'Equipment Purchase', -300.00, 'Expense'),
  (5, 5, '2022-01-15', 'Salary Payment', 7850.00, 'Income');

SELECT * FROM FinancialRecord;