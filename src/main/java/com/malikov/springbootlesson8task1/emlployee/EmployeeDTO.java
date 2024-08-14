package com.malikov.springbootlesson8task1.emlployee;


public class EmployeeDTO {
    private int employeeId;
    private String employeeName;
    private String employeeDepartment;
    private double employeeSalary;

    public EmployeeDTO(int employeeId, String employeeName, String employeeDepartment, double employeeSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeDepartment = employeeDepartment;
        this.employeeSalary = employeeSalary;
    }

    public EmployeeDTO() {
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeDepartment() {
        return employeeDepartment;
    }

    public void setEmployeeDepartment(String employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }
}

