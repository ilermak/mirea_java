package ex_7_8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Company {
    private long income;
    private List<Employee> Operators = new ArrayList<Employee>();
    private List<Employee> Managers = new ArrayList<Employee>();
    private List<Employee> TopManagers = new ArrayList<Employee>();


    public void hire(Employee employee) {
        if (employee.getEmployeePosition().getJobTitle() == "Operator")
            Operators.add(employee);
        else if (employee.getEmployeePosition().getJobTitle() == "Manager")
            Managers.add(employee);
        else if (employee.getEmployeePosition().getJobTitle() == "TopManager")
            TopManagers.add(employee);
    }

    public void hireAll(Employee employee, Employee... employees) {
        hire(employee);
        for (Employee value : employees) {
            hire(value);
        }
    }

    public void fire(String position) {
        if (position == "Operator")
            Operators.remove(Operators.size() - 1);
        else if (position == "Manager")
            Operators.remove(Operators.size() - 1);
        else if (position == "TopManager")
            TopManagers.remove(TopManagers.size() - 1);
    }

    public void firePercents(int percents)
    {
        int num = 100 / percents;

        Operators.sort(Comparator.comparing(Employee::getTotal).reversed());
        int fireNum = Operators.size() / num;
        for (int i = 0; i < fireNum; i++) {
            this.fire("Operator");
        }

        Managers.sort(Comparator.comparing(Employee::getTotal).reversed());
        fireNum = Managers.size() / num;
        for (int i = 0; i < fireNum; i++) {
            this.fire("Manager");
        }

        TopManagers.sort(Comparator.comparing(Employee::getTotal).reversed());
        fireNum = TopManagers.size() / num;
        for (int i = 0; i < fireNum; i++) {
            this.fire("TopManager");
        }

        System.out.println(percents + "% of employees were laid off");
    }

    public void work() {
        for (Employee manager : Managers) {
            manager.setTotal(manager.getEmployeePosition().calcSalary(manager.getSalary()));
            income += (manager.getTotal() - manager.getSalary()) * 20;
        }
        for (Employee operator : Operators) {
            operator.setTotal(operator.getEmployeePosition().calcSalary(operator.getSalary()));
        }
        for (Employee topManger : TopManagers) {
            topManger.setTotal(topManger.getEmployeePosition().calcSalary(topManger.getSalary()));
        }
    }

    public double getIncome() {
        return income;
    }

    public List<Employee> getTopSalaryStaff(int count) {
        if (count > 0) {
            List<Employee> Staff = new ArrayList<Employee>();
            Staff.addAll(Operators);
            Staff.addAll(Managers);
            Staff.addAll(TopManagers);
            if (count <= Staff.size()) {
                Staff.sort(Comparator.comparing(Employee::getTotal).reversed());
                return Staff.subList(0, count);
            }
            return null;
        }
        return null;
    }

    public List<Employee> getLowestSalaryStaff(int count) {
        if (count > 0) {
            List<Employee> Staff = new ArrayList<Employee>();
            Staff.addAll(Operators);
            Staff.addAll(Managers);
            Staff.addAll(TopManagers);
            if (count <= Staff.size()) {
                Staff.sort(Comparator.comparing(Employee::getTotal));
                return Staff.subList(0, count);
            }
            return null;
        }
        return null;
    }
}
