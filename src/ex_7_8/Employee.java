package ex_7_8;

public class Employee {
    private String name;
    private String surname;
    private double salary;
    private double total;
    private EmployeePosition employeePosition;
    public Employee(String name, String surname, double salary, EmployeePosition employeePosition) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.employeePosition = employeePosition;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public EmployeePosition getEmployeePosition() {
        return employeePosition;
    }

    public void setEmployeePosition(EmployeePosition employeePosition) {
        this.employeePosition = employeePosition;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTotal() {
        return total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}