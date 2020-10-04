package ex_7_8;

import java.util.Scanner;

public class CompanyTest {
    public static void main(String[] args) {
        Company company = new Company();
        for (int i = 0; i < 180; i++) {
            String secondName = String.valueOf(i);
            company.hireAll(new Employee("Operator", secondName, (int) (40000 + Math.random() * 10000), new Operator()));
        }
        for (int i = 0; i < 80; i++) {
            String secondName = String.valueOf(i);
            company.hireAll(new Employee("Manager", secondName, (int) (80000 + Math.random() * 10000), new Manager()));
        }
        for (int i = 0; i < 10; i++) {
            String secondName = String.valueOf(i);
            company.hire(new Employee("TopManager", secondName, (int) (90000 + Math.random() * 10000), new TopManager(company)));
        }

        company.workOneMonth();

        System.out.println("Top highest salaries");
        for (Employee employee : company.getTopSalaryStaff(10))
        {
            System.out.println((int) employee.getTotal() + " rub");
        }

        System.out.println("\nTop lowest salaries");
        for (Employee employee : company.getLowestSalaryStaff(30))
        {
            System.out.println((int) employee.getTotal() + " rub");
        }

        company.firePercents(50);

        System.out.println("\n" + "Top highest salaries");
        for (Employee employee : company.getTopSalaryStaff(10))
        {
            System.out.println((int) employee.getTotal() + " rub");
        }

        System.out.println("\nTop lowest salaries");
        for (Employee employee : company.getLowestSalaryStaff(30))
        {
            System.out.println((int) employee.getTotal() + " rub");
        }

        if (true) {
            Scanner input = new Scanner(System.in);
            input.next();
        }
    }
}
