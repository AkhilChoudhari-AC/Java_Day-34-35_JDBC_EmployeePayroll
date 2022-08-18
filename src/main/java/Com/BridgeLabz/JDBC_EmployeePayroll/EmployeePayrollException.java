package Com.BridgeLabz.JDBC_EmployeePayroll;

public class EmployeePayrollException extends Exception {

    private String message;

    public EmployeePayrollException(String message) {
        this.message = message;
    }
}