##### C:\Users\Iluuusha\Desktop\учеба\mirea_java/src/add_1/Change.java
```java
package add_1;

import java.util.Scanner;

public class Change {
    public int search(int x, int y) {
        if (x == 0)
            return 1;
        if (x < 0)
            return 0;
        if (y == 5)
            return search(x - 5, 5) + search(x - 3, 3) + search(x - 1, 1);
        if (y == 3)
            return search(x - 3, 3) + search(x - 1, 1);
        if (y == 1)
            return search(x - 1, 1);
        return 0;
    }

    public static void main(String[] args) {
        Change change = new Change();
        int sc = new Scanner(System.in).nextInt();
        System.out.println(change.search(sc, 5));
    }
}
```
##### C:\Users\Iluuusha\Desktop\учеба\mirea_java/src/ex_1/Main.java
```java
package ex_1;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ex1();
        ex2(args);
        ex3();
        ex4();
        ex5();
    }

    public static void ex1() {
        int[] array = new int[]{12, 28, 467, 45, 51, 87, 707, 48, 90, 20};
        int result = 0;

        int i;
        for(i = 0; i < array.length; ++i) {
            result += array[i];
        }

        System.out.println("Сумма, посчитанная циклом for = " + result);
        i = 0;

        for(result = 0; i < array.length; ++i) {
            result += array[i];
        }

        System.out.println("Сумма, посчитанная циклом while = " + result);
        result = 0;
        i = 0;

        do {
            result += array[i];
            ++i;
        } while(i < array.length);

        System.out.println("Сумма, посчитанная циклом do while = " + result);
    }

    public static void ex2(String[] args) {
        for(int i = 0; i < args.length; ++i) {
            System.out.println("Arguments[" + i + "] : " + args[i]);
        }

    }

    public static void ex3() {
        for(float i = 1.0F; i < 11.0F; ++i) {
            System.out.printf("%.2f \n", 1.0F / i);
        }

    }

    public static void ex4() {
        int[] array = new int[10];

        int i;
        for(i = 0; i < 5; ++i) {
            array[i] = (int)(Math.random() * 100.0D);
            System.out.print(array[i] + " ");
        }

        for(i = 5; i < 10; ++i) {
            Random r = new Random();
            array[i] = r.nextInt(100);
            System.out.print(array[i] + " ");
        }

        System.out.print("\nSorted: ");
        Arrays.sort(array);

        for(i = 0; i < 10; ++i) {
            System.out.print(array[i] + " ");
        }

    }

    public static void ex5() {
        int result = 1;

        for(int i = 1; i < 8; ++i) {
            result += result * i;
        }

        System.out.println(result);
    }
}
```
##### C:\Users\Iluuusha\Desktop\учеба\mirea_java/src/ex_10/Main.java
```java
package ex_10;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            Window window = new Window();

        });
    }
}
```
##### C:\Users\Iluuusha\Desktop\учеба\mirea_java/src/ex_10/Window.java
```java
package ex_10;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class Window extends JFrame {

    static class ImagePanel extends JComponent {
        private Image image;
        public ImagePanel(Image image) {
            this.image = image;
        }
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(image, 0, 0, this);
        }
    }



    private JTextField textField1;
    private JTextField textField2;
    private JLabel label;
    private JLabel label2;
    private JTextField result;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;


    public Window() {
        try {
            BufferedImage myImage = ImageIO.read(new File("C:\\Users\\Iluuusha\\Desktop\\учеба\\mirea_java\\src\\ex_10\\bionic.jpg"));
            setContentPane(new ImagePanel(myImage));
        } catch (IOException e) {
            e.printStackTrace();
        }


        setTitle("Calculator");
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        addFields();
        setResizable(false);


        setListener(button3, '+');
        setListener(button4, '-');
        setListener(button5, '*');
        setListener(button6, ':');


    }

    private void setListener(JButton btn, char smb) {
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double temp=0, temp2 = 0;
                try {
                    temp = Double.parseDouble(textField1.getText());
                    temp2 = Double.parseDouble(textField2.getText());
                } catch (Exception e1) {
                    JOptionPane.showMessageDialog(null, "Вы ввели неверные значения.");
                    return;
                }
                result.setText(calc(temp, temp2, smb));
            }
        });
    }


    private String calc(double a, double b, char c) {
        double result = 0;
        switch (c) {
            case '+':
                result = a + b;
                break;

            case '-':
                result = a - b;
                break;

            case '*':
                result = a * b;
                break;
            case ':':
                try {
                    result = a / b;
                    break;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Деление на ноль");
                    result = 0;
                    break;
                }

        }

        return String.format("%.4f", result);
    }

    private void addFields() {
        textField1 = new JTextField();
        textField2 = new JTextField();
        label = new JLabel("Number 1");
        label2 = new JLabel("Number 2");
        result = new JTextField();
        button3 = new JButton("+");
        button4 = new JButton("-");
        button5 = new JButton("*");
        button6 = new JButton(":");
        int x=50,y=10;

        label.setBounds(x+10, y+10, 50, 25);
        label.setForeground(Color.WHITE);

        textField1.setBounds(x+60, y+10, 100, 25);

        label2.setBounds(x+170, y+10, 50, 25);
        label2.setForeground(Color.WHITE);
        textField2.setBounds(x+220, y+10, 100, 25);
        add(label);
        add(textField1);
        add(label2);
        add(textField2);
        button3.setBounds(x+60, y+90, 45, 45);
        button4.setBounds(x+315, y+100, 45, 45);
        button5.setBounds(x+20, y+180, 45, 45);
        button6.setBounds(x+295, y+200, 45, 45);
        add(button3);
        add(button4);
        add(button5);
        add(button6);
        result.setBounds(x+100, y+420, 150, 25);
        add(result);
    }
}
```
##### C:\Users\Iluuusha\Desktop\учеба\mirea_java/src/ex_11/Threads.java
```java
package ex_11;

import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

public class Threads {

    static int totalSum;
    static ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) throws InterruptedException {

        long startTime = System.currentTimeMillis();
        ArrayList<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            final int localI = i;
            Thread thread = new Thread(() -> hardFunction(localI));
            thread.start();
            threads.add(thread);
        }

        for (Thread t : threads) {
            t.join();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("total time: " + (endTime - startTime));
        System.out.println("total sum: " + totalSum);
    }



    private static void hardFunction(int a) {
        for (int i = 0; i < 10; i++) {
            long startTime = System.currentTimeMillis();
            long result = doHardWork(a * 1000, 100_000_000);
            long endTime = System.currentTimeMillis();
            System.out.println(a + ": " + result + " | time: " + (endTime - startTime));
        }

    }

    private synchronized static long doHardWork(int start, int count) {
        long a = 0;
        for (int i = 0; i < count; i++) {
            a += (start + i) * (start + i) * Math.sqrt(start + i) * (start*start + i*i);
            totalSum++;
        }
        return a;
    }
}
```
##### C:\Users\Iluuusha\Desktop\учеба\mirea_java/src/ex_12/Colors.java
```java
package ex_12;

public enum Colors {
    DEFAULT("\u001B[0m"),
    BLACK("\u001B[30m"),
    RED("\u001B[31m"),
    GREEN ( "\u001B[32m"),
    YELLOW ( "\u001B[33m"),
    BLUE ( "\u001B[34m"),
    MAGENTA ( "\u001B[35m"),
    CYAN ( "\u001B[36m"),
    WHITE ( "\u001B[37m"),
    BRIGHT_BLACk( "\u001B[90m"),
    BRIGHT_RED( "\u001B[91m"),
    BRIGHT_GREEN( "\u001B[92m"),
    BRIGHT_YELLOW( "\u001B[93m"),
    BRIGHT_BLUE( "\u001B[94m"),
    BRIGHT_MAGENTA( "\u001B[95m"),
    BRIGHT_CYAN( "\u001B[96m"),
    BRIGHT_WHITE( "\u001B[97m");

    private final String key;

    public String getKey() {
        return key;
    }

    Colors(String key) {
        this.key = key;
    }
}
```
##### C:\Users\Iluuusha\Desktop\учеба\mirea_java/src/ex_12/Main.java
```java
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
```
##### C:\Users\Iluuusha\Desktop\учеба\mirea_java/src/ex_13/Adria.java
```java
package ex_13;

public class Adria {
    int experience;
    String name = "Adria";

    public void setExperience(int experience) throws Exception {
        if (experience > 99999) {
            throw new OutOfLevelException();
        }
        if (experience < 1) {
            throw new Exception();
        }
        this.experience = experience;
    }

    public void setName(String name) {
        throw new NameException();
    }

    @Override
    public String toString() {
        return "Adria{" +
                "experience=" + experience +
                '}';
    }
}
```
##### C:\Users\Iluuusha\Desktop\учеба\mirea_java/src/ex_13/Main.java
```java
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
```
##### C:\Users\Iluuusha\Desktop\учеба\mirea_java/src/ex_13/NameException.java
```java
package ex_13;

public class NameException extends RuntimeException {
}
```
##### C:\Users\Iluuusha\Desktop\учеба\mirea_java/src/ex_13/OutOfLevelException.java
```java
package ex_13;

public class OutOfLevelException extends Exception {
}
```
##### C:\Users\Iluuusha\Desktop\учеба\mirea_java/src/ex_14/Regex.java
```java
package ex_14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashMap;

public class Regex {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] rules = new String[Integer.parseInt(in.nextLine())];
        int length = rules.length;
        for (int i = 0; i < length; i++) {
            rules[i] = in.nextLine();
        }
        String text = in.nextLine();
        String srcStr = "";
        for (int i = 0; i < length; i++) {
            srcStr += rules[i].split(" ")[0];
            if (i != length - 1) srcStr += "|";
        }
        HashMap<String, String> replaceMap = new HashMap<>();
        for (String t : rules) replaceMap.put(t.split(" ")[0], t.split(" ")[1]);
        Pattern pattern = Pattern.compile(srcStr);
        Matcher matcher = pattern.matcher(text);
        System.out.println(matcher.replaceAll(x -> replaceMap.get(x.group())));
    }
}
```
##### C:\Users\Iluuusha\Desktop\учеба\mirea_java/src/ex_14/WithoutRegex.java
```java
package ex_14;

import java.util.Scanner;

public class WithoutRegex {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] rules = new String[Integer.parseInt(in.nextLine())];
        int length = rules.length;
        for (int i = 0; i < length; i++) {
            rules[i] = in.nextLine();
        }
        String text = in.nextLine();
        String textPiece;
        String textCopy;
        String[] src = new String[length];
        String[] ptr = new String[length];
        textPiece = "";
        textCopy = text;
        for (int i = 0; i < length; i++) {
            src[i] = rules[i].split(" ")[0];
            ptr[i] = rules[i].split(" ")[1];
        }
        for (int j = 0; j < text.length(); j++) {
            textPiece += text.charAt(j);

            for (int i = 0; i < src.length; i++) {
                if (src[i].contains(textPiece) && textCopy.contains(src[i]))
                    textCopy = textCopy.replaceAll(src[i], " " + ptr[i] + " ");

                else if (textPiece.contains(src[i])) {
                    textCopy = textCopy.replaceAll(src[i], " " + ptr[i] + " ");
                    textPiece = "";
                    break;
                }
            }
        }
        System.out.println(textCopy.replace(" ", ""));
    }
}
```
##### C:\Users\Iluuusha\Desktop\учеба\mirea_java/src/ex_15_16/Main.java
```java
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
```
##### C:\Users\Iluuusha\Desktop\учеба\mirea_java/src/ex_17_18/Main.java
```java
package ex_17_18;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    static PrintWriter pw;

    static {
        try {
            pw = new PrintWriter("result.md");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void getContents(String path){
        File file = new File(path);
        if(file.isDirectory()){
            String[] contents = file.list();
            for (String s:contents) {
                getContents(path+"/"+s);
            }
        }
        if(file.isFile() ) {
            if (file.getName().substring(file.getName().lastIndexOf(".")).equals(".java")) {
                try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
                    pw.write("##### " + path + "\n```java\n");
                    String line = reader.readLine();
                    while (line != null) {
                        pw.write(line + "\n");
                        line = reader.readLine();
                    }
                    pw.write("```\n");


                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }

    }

    public static void main(String[] args) {
        Path filePath = Paths.get("").toAbsolutePath();
        getContents(filePath.toString()+"/src");
        pw.close();
    }
}
```
##### C:\Users\Iluuusha\Desktop\учеба\mirea_java/src/ex_2/Ball.java
```java
package ex_2;

public class Ball {
    float volume = 13.37f;
}
```
##### C:\Users\Iluuusha\Desktop\учеба\mirea_java/src/ex_2/Book.java
```java
package ex_2;

public class Book {
    int page = 1337;
}
```
##### C:\Users\Iluuusha\Desktop\учеба\mirea_java/src/ex_2/Dog.java
```java
package ex_2;

public class Dog {
    String nickname = "Buddy";
    int age = 7;

    @Override
    public String toString() {
        return "ex_2.Dog{" +
                "nickname='" + nickname + '\'' +
                ", age=" + age +
                '}';
    }

    public Dog(String nickname, int age) {
        this.nickname = nickname;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public String getNickname() {
        return nickname;
    }

    public int humanAge() {
        return age*7;
    }
}
```
##### C:\Users\Iluuusha\Desktop\учеба\mirea_java/src/ex_2/DogKennel.java
```java
package ex_2;

import java.util.ArrayList;

class DogKennel {
    ArrayList <Dog> array = new ArrayList<>();

    public void addArray(Dog obj) {
        array.add(obj);
    }

    public static void main(String[] args) {
        DogKennel kennel = new DogKennel();
        Dog doggy = new Dog("Sharik", 12);
        kennel.addArray(doggy);
    }
}
```
##### C:\Users\Iluuusha\Desktop\учеба\mirea_java/src/ex_2/Shape.java
```java
package ex_2;

public class Shape {
    String color;
    boolean filled;

    @Override
    public String toString() {
        return "ex_2.Shape{" +
                "color='" + getColor() + '\'' +
                ", filled='" + getFilled() + '\'' +
                '}';
    }

    public Shape() {

    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean getFilled() {
        return filled;
    }

    public static void main(String[] args) {

    }
}
```
##### C:\Users\Iluuusha\Desktop\учеба\mirea_java/src/ex_2/ShapeTest.java
```java
package ex_2;

class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.setColor("blue");
        shape.setFilled(true);
        System.out.println(shape.toString());
    }
}
```
##### C:\Users\Iluuusha\Desktop\учеба\mirea_java/src/ex_3/Book.java
```java
package ex_3;

public class Book {
    private String Author="Perskii";
    private String name="Moskva";
    private int date=1967;

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
```
##### C:\Users\Iluuusha\Desktop\учеба\mirea_java/src/ex_3/BookTester.java
```java
package ex_3;

public class BookTester {
    public static void main(String[] args) {
        Book book=new Book();
        System.out.println("Start properties:\nAuthor is "+book.getAuthor()+"\nThe name is "+ book.getName()+"\nThe date of publishing is "+book.getDate());
        book.setAuthor("Platina");
        book.setDate(2017);
        book.setName("Eto-ne-lubov");
        System.out.println("New properties:\nAuthor is "+book.getAuthor()+"\nThe name is "+ book.getName()+"\nThe date of publishing is "+book.getDate());
    }

}
```
##### C:\Users\Iluuusha\Desktop\учеба\mirea_java/src/ex_3/Circle.java
```java
package ex_3;

public class Circle {
    private float radius=0;
    private float posX=0;
    private float posY=0;

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public float getPosX() {
        return posX;
    }

    public void setPosX(float posX) {
        this.posX = posX;
    }

    public float getPosY() {
        return posY;
    }

    public void setPosY(float posY) {
        this.posY = posY;
    }
}
```
##### C:\Users\Iluuusha\Desktop\учеба\mirea_java/src/ex_3/CircleTester.java
```java
package ex_3;

public class CircleTester {
    public static void main(String[] args)
    {
        Circle circle=new Circle();
        System.out.println("Start properties:\nR="+circle.getRadius()+"\nPosition x="+ circle.getPosX()+"\nPosition y="+ circle.getPosY());
        circle.setRadius(9.5f);
        circle.setPosX(17.88f);
        circle.setPosY(4f);
        System.out.print("New properties\nR="+circle.getRadius()+"\nPosition x="+ circle.getPosX()+"\nPosition y="+ circle.getPosY());
    }
}
```
##### C:\Users\Iluuusha\Desktop\учеба\mirea_java/src/ex_3/Hand.java
```java
package ex_3;

public class Hand {
    private int size=0;
    private int width=0;
    private int numberOfFingers=0;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getNumberOfFingers() {
        return numberOfFingers;
    }

    public void setNumberOfFingers(int numberOfFingers) {
        this.numberOfFingers = numberOfFingers;
    }



}
```
##### C:\Users\Iluuusha\Desktop\учеба\mirea_java/src/ex_3/Head.java
```java
package ex_3;

public class Head {
    private int size=0;
    private String hairColor=null;
    private String headShape=null;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getHeadShape() {
        return headShape;
    }

    public void setHeadShape(String headShape) {
        this.headShape = headShape;
    }

}
```
##### C:\Users\Iluuusha\Desktop\учеба\mirea_java/src/ex_3/Human.java
```java
package ex_3;

public class Human {
    private String name=null;
    private int height=0;
    private int weight=0;
    private Hand l_hand=null;
    private Hand r_hand=null;
    private Leg l_leg=null;
    private Leg r_leg=null;
    private Head head;

    public Hand getL_hand() {
        return l_hand;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public void setL_hand(Hand l_hand) {
        this.l_hand = l_hand;
    }

    public Hand getR_hand() {
        return r_hand;
    }

    public void setR_hand(Hand r_hand) {
        this.r_hand = r_hand;
    }

    public Leg getL_leg() {
        return l_leg;
    }

    public void setL_leg(Leg l_leg) {
        this.l_leg = l_leg;
    }

    public Leg getR_leg() {
        return r_leg;
    }

    public void setR_leg(Leg r_leg) {
        this.r_leg = r_leg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", l_hand=" + l_hand +
                ", r_hand=" + r_hand +
                ", l_leg=" + l_leg +
                ", r_leg=" + r_leg +
                '}';
    }
}
```
##### C:\Users\Iluuusha\Desktop\учеба\mirea_java/src/ex_3/HumanTester.java
```java
package ex_3;

public class HumanTester {
    public static void main(String[] args) {

        Human human=new Human();
        System.out.println("Start properties:");
        System.out.println(human.toString());
        human.setName("Iisac");
        human.setHeight(184);
        human.setWeight(79);
        Hand l_hand=new Hand();
        l_hand.setNumberOfFingers(5);
        l_hand.setSize(19);
        l_hand.setWidth(5);
        Hand r_hand=new Hand();
        r_hand.setSize(19);
        r_hand.setWidth(4);
        r_hand.setNumberOfFingers(5);
        Leg l_leg=new Leg();
        l_leg.setNumberOfFingers(1);
        l_leg.setSize(45);
        l_leg.setWidth(19);
        Leg r_leg=new Leg();
        r_leg.setSize(45);
        r_leg.setWidth(18);
        r_leg.setNumberOfFingers(2);
        Head head=new Head();
        head.setHairColor("Red");
        head.setHeadShape("Square");
        head.setSize(99);
        human.setL_hand(l_hand);
        human.setR_hand(r_hand);
        human.setL_leg(l_leg);
        human.setR_leg(r_leg);
        human.setHead(head);
        System.out.println("New properties:");
        System.out.println("Height is "+human.getHeight());
        System.out.println("Name is "+human.getName());
        System.out.println("Weight is "+human.getWeight());
        System.out.println("Left hand properties:");
        System.out.println("Left hand number of fingers is "+human.getL_hand().getNumberOfFingers());
        System.out.println("Left hand size is "+human.getL_hand().getSize());
        System.out.println("Left hand width is "+human.getL_hand().getWidth());

        System.out.println("Right hand properties:");
        System.out.println("Right hand number of fingers is "+human.getR_hand().getNumberOfFingers());
        System.out.println("Right hand size is "+human.getR_hand().getSize());
        System.out.println("Right hand width is "+human.getR_hand().getWidth());

        System.out.println("Left leg properties:");
        System.out.println("Left leg number of fingers is "+human.getL_leg().getNumberOfFingers());
        System.out.println("Left leg size is "+human.getL_leg().getSize());
        System.out.println("Left leg width is "+human.getL_leg().getWidth());

        System.out.println("Right leg properties:");
        System.out.println("Right leg number of fingers is "+human.getR_leg().getNumberOfFingers());
        System.out.println("Right leg size is "+human.getR_leg().getSize());
        System.out.println("Right leg width is "+human.getR_leg().getWidth());


        System.out.println("Head properties:");
        System.out.println("Head hair color is "+human.getHead().getHairColor());
        System.out.println("Head shape is "+human.getHead().getHeadShape());
        System.out.println("Head size is "+human.getHead().getSize());



    }
}
```
##### C:\Users\Iluuusha\Desktop\учеба\mirea_java/src/ex_3/Leg.java
```java
package ex_3;

public class Leg {
    private int size=0;
    private int width=0;
    private int numberOfFingers=0;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getNumberOfFingers() {
        return numberOfFingers;
    }

    public void setNumberOfFingers(int numberOfFingers) {
        this.numberOfFingers = numberOfFingers;
    }

}
```
##### C:\Users\Iluuusha\Desktop\учеба\mirea_java/src/ex_4/Circle.java
```java
package ex_4;

public class Circle extends Shape{
    double radius;
    public Circle(){};
    Circle(double radius_){
        this.radius = radius;
    }
    Circle(double radius, String color,boolean filled){
        super(color,filled);
        this.radius = radius;
    }

    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }

    @Override
    double getArea() { return Math.PI*Math.pow(getRadius(),2); }

    @Override
    double getPerimeter() { return Math.PI*radius*2; }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", is filled: "+isFilled()+
                ", color = " + getColor()+
                '}';
    }
}
```
##### C:\Users\Iluuusha\Desktop\учеба\mirea_java/src/ex_4/Main.java
```java
package ex_4;

public class Main {

    public static void main(String[] args){
        Square sq = new Square(15,"red",true);
        Square sq1 = new Square(20,"green",true);
        System.out.println(sq);
        System.out.println(sq1);
    }
}
```
##### C:\Users\Iluuusha\Desktop\учеба\mirea_java/src/ex_4/Rectangle.java
```java
package ex_4;

public class Rectangle extends Shape{
    protected double width, height;
    Rectangle(double width, double height){
        this.width = width;
        this.height = height;

    }
    Rectangle(double width, double height, String color, boolean filled){
        super(color,filled);
        this.width = width;
        this.height = height;
    }

    public Rectangle() {

    }

    public double getWidth() { return width; }

    public void setWidth(double width) { this.width = width; }

    public double getHeight() { return height; }

    public void setHeight(double height) { this.height = height; }

    @Override
    double getArea() { return width*height; }

    @Override
    double getPerimeter() { return 2*(width+height); }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", is filled: "+isFilled()+
                ", color = " + getColor()+
                '}';
    }
}
```
##### C:\Users\Iluuusha\Desktop\учеба\mirea_java/src/ex_4/Shape.java
```java
package ex_4;

abstract class Shape{
    String color;
    boolean filled;
    Shape(){};
    Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public void setColor(String color) { this.color = color; }
    public String getColor() { return color; }
    public void setFilled( boolean filled) { this.filled = filled; }
    public boolean isFilled() { return filled; }

    abstract double getArea();
    abstract double getPerimeter();
}
```
##### C:\Users\Iluuusha\Desktop\учеба\mirea_java/src/ex_4/Square.java
```java
package ex_4;

class Square extends Rectangle{
    double side;
    Square(){};
    Square(double side){
        this.side = side;
    }
    Square(double side, String color, boolean filled){
        super(side,side,color,filled);
    }

    public double getSide() { return side; }
    public void setSide(double side) { this.side = side; }

    @Override
    public void setWidth(double side) {
        super.width = super.height = side;
    }
    public void setHeight(double side) {
        super.width = super.height = side;
    }
}
```
##### C:\Users\Iluuusha\Desktop\учеба\mirea_java/src/ex_5/Main.java
```java
package ex_5;

public class Main {
    public static void main(String[] args) {
        MovableCircle mc = new MovableCircle();
        mc.setCenter(28, 64);

        MovableRectangle mr = new MovableRectangle(20, 60, 55, 70);


        System.out.println("Circle:");
        System.out.println(mc.toString());
        mc.move(60, 70);
        System.out.println(mc.toString());

        System.out.println("Rectangle:");
        System.out.println(mr.toString());
        mr.setHeight(25);
        mr.setWidth(350);
        System.out.println(mr.toString());
        mr.move(70, 70);
        System.out.println(mr.toString());

    }
}
```
##### C:\Users\Iluuusha\Desktop\учеба\mirea_java/src/ex_5/Movable.java
```java
package ex_5;

public interface Movable {
    public void move(int x, int y);
}
```
##### C:\Users\Iluuusha\Desktop\учеба\mirea_java/src/ex_5/MovableCircle.java
```java
package ex_5;

import ex_4.Circle;

public class MovableCircle extends Circle implements Movable {

    private MovablePoint center = new MovablePoint();

    public MovablePoint getCenter() {
        return center;
    }

    public void setCenter(int x, int y) {
        this.center.setX(x);
        this.center.setY(y);
    }

    @Override
    public void move(int x, int y) {
        center.move(x, y);
        System.out.println(" for center");
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "center=" + center +
                '}';
    }
}
```
##### C:\Users\Iluuusha\Desktop\учеба\mirea_java/src/ex_5/MovablePoint.java
```java
package ex_5;

public class MovablePoint implements Movable {

    private int x;
    private int y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public void move(int x, int y) {
        this.x+=x;
        this.y+=y;
        System.out.print("Moved on "+x+" by x and "+ y+" by y");
    }
}
```
##### C:\Users\Iluuusha\Desktop\учеба\mirea_java/src/ex_5/MovableRectangle.java
```java
package ex_5;

import ex_4.Rectangle;

public class MovableRectangle extends Rectangle implements Movable{

    private MovablePoint topLeft = new MovablePoint();
    private MovablePoint bottomRight = new MovablePoint();


    public MovableRectangle(int x1, int y1, int x2, int y2) {
        if (x1>x2) {
            topLeft.setX(x2);
            bottomRight.setX(x1);
        }
        else if (x2<x1)  {
            topLeft.setX(x1);
            bottomRight.setX(x2);
        }
        if (y1>y2) {
            topLeft.setY(y1);
            bottomRight.setY(y2);
        }
        else if (y2>y1) {
            topLeft.setY(y2);
            bottomRight.setY(y1);
        }

        width = bottomRight.getX()-topLeft.getX();
        height = topLeft.getY()-bottomRight.getY();
    }

    public MovablePoint getTopLeft() {
        return topLeft;
    }

    public MovablePoint getBottomRight() {
        return bottomRight;
    }

    @Override
    public void setHeight(double h) {
        bottomRight.move(0, (int) (h-height));
        System.out.println(" for bottom right");
        height=h;
    }

    @Override
    public void setWidth(double w) {
        bottomRight.move((int) (w-width), 0);
        System.out.println(" for bottom right");
        width=w;
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                ", width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public void move(int x, int y) {
        topLeft.move(x, y);
        System.out.println(" for top left");
        bottomRight.move(x, y);
        System.out.println(" for bottom right");
    }
}
```
##### C:\Users\Iluuusha\Desktop\учеба\mirea_java/src/ex_6/Main.java
```java
package ex_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        System.out.print("Размер поля: ");
        int AreaSize = In.nextInt();
        int Area[][] = new int[AreaSize][AreaSize];
        int Max = 100, Min = -100;

        for(int i = 0; i < AreaSize; i++)
            for (int y = 0; y < AreaSize; y++)
                Area [i][y] = (int)((Math.random() * ((Max - Min) + 1)) + Min);

        for(int x = 0; x < AreaSize; x++){
            for (int y = 0; y < AreaSize; y++) System.out.print(Area[x][y] + "\t");
            System.out.println();
        }

        for(int x = 0; x < AreaSize; x++)
            for(int y = 0; y < AreaSize; y++){
                if(x > 0 && y > 0) Area[x][y] += Math.max(Area[x-1][y], Area[x][y-1]);
                else {
                    if(x > 0) Area[x][y] += Area[x - 1][y];
                    else if(y > 0) Area[x][y] += Area[x][y - 1];
                }
            }

        System.out.print("Сумма: ");
        System.out.print(Area[AreaSize - 1][AreaSize - 1]);
    }
}
```
##### C:\Users\Iluuusha\Desktop\учеба\mirea_java/src/ex_7_8/Company.java
```java
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
}
```
##### C:\Users\Iluuusha\Desktop\учеба\mirea_java/src/ex_7_8/CompanyTest.java
```java
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

        company.work();

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
```
##### C:\Users\Iluuusha\Desktop\учеба\mirea_java/src/ex_7_8/Employee.java
```java
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
```
##### C:\Users\Iluuusha\Desktop\учеба\mirea_java/src/ex_7_8/EmployeePosition.java
```java
package ex_7_8;

public interface EmployeePosition {
    double calcSalary(double baseSalary);
    String getJobTitle();
}
```
##### C:\Users\Iluuusha\Desktop\учеба\mirea_java/src/ex_7_8/Manager.java
```java
package ex_7_8;

public class Manager implements EmployeePosition {

    @Override
    public String getJobTitle() {
        return "Manager";
    }

    @Override
    public double calcSalary(double baseSalary) {
        return baseSalary + 0.05 * (int) (115000 + Math.random() * 25000);
    }
}
```
##### C:\Users\Iluuusha\Desktop\учеба\mirea_java/src/ex_7_8/Operator.java
```java
package ex_7_8;

public class Operator implements EmployeePosition {

    @Override
    public String getJobTitle() {
        return "Operator";
    }

    @Override
    public double calcSalary(double baseSalary) {
        return baseSalary;
    }
}
```
##### C:\Users\Iluuusha\Desktop\учеба\mirea_java/src/ex_7_8/TopManager.java
```java
package ex_7_8;

public class TopManager implements EmployeePosition {
    private Company company;

    TopManager(Company company) {
        this.company = company;
    }

    @Override
    public String getJobTitle() {
        return "TopManager";
    }

    @Override
    public double calcSalary(double baseSalary) {
        if (company.getIncome() > 10000000)
            return baseSalary * 2.5;
        else
            return baseSalary;
    }
}
```
##### C:\Users\Iluuusha\Desktop\учеба\mirea_java/src/ex_9/Company.java
```java
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
```
##### C:\Users\Iluuusha\Desktop\учеба\mirea_java/src/ex_9/Dates.java
```java
package ex_9;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dates {
    LocalDate ld;
    DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public Dates(int day, int month, int year) {
        ld = LocalDate.of(year, month, day);
    }

    @Override
    public String toString() {
        return f.format(ld);
    }
}
```
##### C:\Users\Iluuusha\Desktop\учеба\mirea_java/src/ex_9/Employee.java
```java
package ex_9;

public class Employee {
    private String firstName, lastName, place;
    private int number;
    private Dates dates;

    public Employee(String firstName, String secondName, String place, int number, Dates dates) {
        this.firstName = firstName;
        this.lastName = secondName;
        this.place = place;
        this.number = number;
        this.dates = dates;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return firstName +
                " " + lastName +
                "," + place +
                "," + number +
                ", " + dates;
    }
}
```
##### C:\Users\Iluuusha\Desktop\учеба\mirea_java/src/ex_9/EmployeeHandler.java
```java
package ex_9;

public interface EmployeeHandler {
    void handleEmployees(Employee employee, int index);
}
```
##### C:\Users\Iluuusha\Desktop\учеба\mirea_java/src/ex_9/EmployeeSelector.java
```java
package ex_9;

public interface EmployeeSelector {
    boolean isNeedEmployee(Employee employee);
}
```
##### C:\Users\Iluuusha\Desktop\учеба\mirea_java/src/ex_9/Main.java
```java
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
```
##### C:\Users\Iluuusha\Desktop\учеба\mirea_java/src/ex_9/UsageInterface.java
```java
package ex_9;

public class UsageInterface implements EmployeeSelector {

    private int number;

    public UsageInterface(int number) {
        this.number = number;
    }

    @Override
    public boolean isNeedEmployee(Employee employee) {
        return employee.getNumber() >= number;
    }
}
```
