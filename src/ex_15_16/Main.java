package ex_15_16;

import java.util.Scanner;

public class Main {
    private Main next0;
    private Main next1;
    private String step0;
    private String step1;

    public static Scanner scanner = new Scanner(System.in);

    public Main(String step0, String step1) {
        this.step0 = step0;
        this.step1 = step1;
    }

    public static void main(String[] args) {
        Main S1 = new Main("create_project", "add_library");
        Main S2 = new Main("test", "drop_db");
        Main S3 = new Main("drop_db", "add_library");
        Main S4 = new Main("restart", "deploy");
        Main S5 = new Main("deploy", "restart");

        S1.set(S2,S5);
        S2.set(S3,S4);
        S3.set(S4,S5);
        S4.set(S3,S5);
        S5.set(S1,S3);

        S1.S(scanner.nextInt());
    }

    public void set(Main next0, Main next1) {
        this.next0 = next0;
        this.next1 = next1;
    }

    public void S(int number) {
        if (number == 0) {
            System.out.println(step0);
            next0.S(scanner.nextInt());
        }
        else if (number == 1) {
            System.out.println(step1);
            next1.S(scanner.nextInt());
        }
        else return;
    }

}
