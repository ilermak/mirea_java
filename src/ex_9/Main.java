package ex_9;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        Random r = new Random(100000);

        for (int i = 0; i < 100; i++) {
            company.hire(new Employee(
                    "Vasiliy",
                    "Poopkin",
                    "Lesoriev",
                    r.nextInt(10000000),
                    new Dates(11, 9, 2001)));
        }

        company.doSomethingWithEmployee(
                new UsageInterface(9_000_000),
                (employee, i) -> System.out.println("employee " + i + ":" + employee));

        int m = 20_000;
        company.doSomethingWithEmployee(new EmployeeSelector() {
            @Override
            public boolean isNeedEmployee(Employee employee) {
                return employee.getNumber() < m;
            }
        }, new EmployeeHandler() {
            @Override
            public void handleEmployees(Employee employee, int index) {
                System.out.println("______" + index + "______");
                System.out.println(employee);
            }
        });

        ArrayList<Employee> selection = new ArrayList<>();
        company.doSomethingWithEmployee(
                employee -> employee.getNumber() > 1_000_000,
                (employee, i) -> selection.add(employee));
        System.out.println(selection + "selection");
    }
}
