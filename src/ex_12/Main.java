package ex_12;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String text;
        text = "Hello, world!";
        print(text, Colors.BRIGHT_YELLOW);
        print(text);
        System.out.println();


    }

    public static void print(String text, Colors color) {
        System.out.println(color.getKey() + text);
    }

    public static void print(String text) {
        for (Colors color : Colors.values())
            System.out.println(color.getKey() + text);
    }
}
