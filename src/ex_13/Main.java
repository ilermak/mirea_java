package ex_13;

import java.util.Scanner;

public class Main {

    static void addExperience(Adria i) throws Exception {
        try {
            int items = Integer.parseInt(new Scanner(System.in).nextLine());
            i.setExperience(items);
        } catch (OutOfLevelException ex) {
            System.out.println("Out of level!");
        } catch (Exception ex) {
            System.out.println("Invalid input!");
        } finally {
            System.out.println(i.toString());
        }
    }

    public static void main(String[] args) throws Exception {
        Adria xpBar = new Adria();
        addExperience(xpBar);
        xpBar.setName("Morozov");

    }
}