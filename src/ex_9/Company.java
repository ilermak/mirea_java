package ex_9;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private List<Employee> employeeList = new ArrayList<>();

    public void hire(Employee employee) {
        employeeList.add(employee);
    }

    public void doSomethingWithEmployee(
            EmployeeSelector selector,
            EmployeeHandler handler
    ) {
        int count = 0;
        for(Employee employee : employeeList) {
            if (selector.isNeedEmployee(employee)) {
                handler.handleEmployees(employee, count);
                count++;
            }
        }
        System.out.println(count);
    }
}
