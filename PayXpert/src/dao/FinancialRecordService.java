package dao;

import entity.FinancialRecord;

import java.util.Date;
import java.util.List;

public class FinancialRecordService implements IFinancialRecordService {
    @Override
    public void addFinancialRecord(int employeeId, String description, double amount, String recordType) {
        //  logic to add a financial record to the database
    }

    @Override
    public FinancialRecord getFinancialRecordById(int recordId) {
        //  logic to retrieve a financial record by ID from the database
        return null;
    }

    @Override
    public List<FinancialRecord> getFinancialRecordsForEmployee(int employeeId) {
        //  logic to retrieve all financial records for a specific employee from the database
        return null;
    }

    @Override
    public List<FinancialRecord> getFinancialRecordsForDate(Date recordDate) {
        //  logic to retrieve all financial records for a specific date from the database
        return null;
    }
}
