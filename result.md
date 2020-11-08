### C:\Users\Iluuusha\Desktop\учеба\mirea_java\src\add_1\Change.java
```java


    public int search(int x, int y) {
            return 1;
            return 0;
            return search(x - 5, 5) + search(x - 3, 3) + search(x - 1, 1);
            return search(x - 3, 3) + search(x - 1, 1);
            return search(x - 1, 1);
    }
    public static void main(String[] args) {
        int sc = new Scanner(System.in).nextInt();
    }
null
```
### C:\Users\Iluuusha\Desktop\учеба\mirea_java\src\ex_1\Main.java
```java

import java.util.Random;
public class Main {
    public static void main(String[] args) {
        ex2(args);
        ex4();
    }
    public static void ex1() {
        int result = 0;
        int i;
            result += array[i];

        i = 0;
        for(result = 0; i < array.length; ++i) {
        }
        System.out.println("Сумма, посчитанная циклом while = " + result);
        i = 0;
        do {
            ++i;

    }
    public static void ex2(String[] args) {
            System.out.println("Arguments[" + i + "] : " + args[i]);


        for(float i = 1.0F; i < 11.0F; ++i) {
        }
    }
    public static void ex4() {

        for(i = 0; i < 5; ++i) {
            System.out.print(array[i] + " ");

            Random r = new Random();
            System.out.print(array[i] + " ");

        Arrays.sort(array);
        for(i = 0; i < 10; ++i) {
        }
    }
    public static void ex5() {

            result += result * i;

    }
null
```
### C:\Users\Iluuusha\Desktop\учеба\mirea_java\src\ex_10\Main.java
```java



        SwingUtilities.invokeLater(()->{

    }
null
```
### C:\Users\Iluuusha\Desktop\учеба\mirea_java\src\ex_10\Window.java
```java

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;


        private Image image;
            this.image = image;
        @Override
            super.paintComponent(g);
        }


    private JTextField textField2;
    private JLabel label2;
    private JButton button3;
    private JButton button5;

    public Window() {
            BufferedImage myImage = ImageIO.read(new File("C:\\Users\\Iluuusha\\Desktop\\учеба\\mirea_java\\src\\ex_10\\bionic.jpg"));
        } catch (IOException e) {
        }

        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);

        setListener(button4, '-');
        setListener(button6, ':');


        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    temp2 = Double.parseDouble(textField2.getText());
                    JOptionPane.showMessageDialog(null, "Вы ввели неверные значения.");
                }
            }
    }

        double result = 0;
            case '+':
                break;
            case '-':
                break;
            case '*':
                break;
                try {
                    break;
                    JOptionPane.showMessageDialog(null, "Деление на ноль");
                    break;


    }
    private void addFields() {
        textField2 = new JTextField();
        label2 = new JLabel("Number 2");
        button3 = new JButton("+");
        button5 = new JButton("*");
        int x=50,y=10;
        label.setBounds(x+10, y+10, 50, 25);


        label2.setForeground(Color.WHITE);
        add(label);
        add(label2);
        button3.setBounds(x+60, y+90, 45, 45);
        button5.setBounds(x+20, y+180, 45, 45);
        add(button3);
        add(button5);
        result.setBounds(x+100, y+420, 150, 25);
    }
null
```
### C:\Users\Iluuusha\Desktop\учеба\mirea_java\src\ex_11\Threads.java
```java

import java.util.concurrent.locks.ReentrantLock;
public class Threads {
    static int totalSum;


        ArrayList<Thread> threads = new ArrayList<>();
            final int localI = i;
            thread.start();
        }
        for (Thread t : threads) {
        }
        System.out.println("total time: " + (endTime - startTime));
    }

    private static void hardFunction(int a) {
            long startTime = System.currentTimeMillis();
            long endTime = System.currentTimeMillis();
        }
    }
    private synchronized static long doHardWork(int start, int count) {
        for (int i = 0; i < count; i++) {
            totalSum++;
        return a;
}
```
### C:\Users\Iluuusha\Desktop\учеба\mirea_java\src\ex_12\Colors.java
```java

    DEFAULT("\u001B[0m"),
    RED("\u001B[31m"),
    YELLOW ( "\u001B[33m"),
    MAGENTA ( "\u001B[35m"),
    WHITE ( "\u001B[37m"),
    BRIGHT_RED( "\u001B[91m"),
    BRIGHT_YELLOW( "\u001B[93m"),
    BRIGHT_MAGENTA( "\u001B[95m"),
    BRIGHT_WHITE( "\u001B[97m");
    private final String key;
    public String getKey() {
    }
    Colors(String key) {
    }
null
```
### C:\Users\Iluuusha\Desktop\учеба\mirea_java\src\ex_12\Main.java
```java



        String text;
        print(text, Colors.BRIGHT_YELLOW);
        System.out.println();


        System.out.println(color.getKey() + text);

        for (Colors color : Colors.values())
    }
null
```
### C:\Users\Iluuusha\Desktop\учеба\mirea_java\src\ex_13\Adria.java
```java

    int experience;

        if (experience > 99999) {
        }
            throw new Exception();
        this.experience = experience;

        throw new NameException();

    public String toString() {
                "experience=" + experience +
    }
null
```
### C:\Users\Iluuusha\Desktop\учеба\mirea_java\src\ex_13\Main.java
```java



        try {
            i.setExperience(items);
            System.out.println("Out of level!");
            System.out.println("Invalid input!");
            System.out.println(i.toString());
    }
    public static void main(String[] args) throws Exception {
        addExperience(xpBar);

}
```
### C:\Users\Iluuusha\Desktop\учеба\mirea_java\src\ex_13\NameException.java
```java

}
```
### C:\Users\Iluuusha\Desktop\учеба\mirea_java\src\ex_13\OutOfLevelException.java
```java

}
```
### C:\Users\Iluuusha\Desktop\учеба\mirea_java\src\ex_14\Regex.java
```java

import java.util.regex.Matcher;
import java.util.HashMap;
public class Regex {
    public static void main(String[] args) {
        String[] rules = new String[Integer.parseInt(in.nextLine())];
        for (int i = 0; i < length; i++) {
        }
        String srcStr = "";
            srcStr += rules[i].split(" ")[0];
        }
        for (String t : rules) replaceMap.put(t.split(" ")[0], t.split(" ")[1]);
        Matcher matcher = pattern.matcher(text);
    }
null
```
### C:\Users\Iluuusha\Desktop\учеба\mirea_java\src\ex_14\WithoutRegex.java
```java



        Scanner in = new Scanner(System.in);
        int length = rules.length;
            rules[i] = in.nextLine();
        String text = in.nextLine();
        String textCopy;
        String[] ptr = new String[length];
        textCopy = text;
            src[i] = rules[i].split(" ")[0];
        }
            textPiece += text.charAt(j);
            for (int i = 0; i < src.length; i++) {
                    textCopy = textCopy.replaceAll(src[i], " " + ptr[i] + " ");
                else if (textPiece.contains(src[i])) {
                    textPiece = "";
                }
        }
    }
null
```
### C:\Users\Iluuusha\Desktop\учеба\mirea_java\src\ex_15_16\Main.java
```java


    private Main next0;
    private String step0;


        this.step0 = step0;
    }
    public static void main(String[] args) {
        Main S2 = new Main("test", "drop_db");
        Main S4 = new Main("restart", "deploy");

        S2.set(S3,S4);
        S4.set(S3,S5);

    }
    public void set(Main next0, Main next1) {
        this.next1 = next1;

        if (number == 0) {
            next0.S(scanner.nextInt());
        else if (number == 1) {
            next1.S(scanner.nextInt());
        else return;

null
```
### C:\Users\Iluuusha\Desktop\учеба\mirea_java\src\ex_17_18\Main.java
```java



    public static void searchInDir(String path) {

        {
            {
            }
        else if(file.isFile() && file.getPath().endsWith(".java"))
            try(BufferedReader reader = new BufferedReader(new FileReader(file.getPath())))
                result.append("### " + file.getPath() + "\n" + "```java" + "\n");
                {
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                e.printStackTrace();

    }
    public static void main(String[] args) {
        searchInDir("C:\\Users\\Iluuusha\\Desktop\\учеба\\mirea_java\\src");
        {
        }
        {
            ex.printStackTrace();
            e.printStackTrace();
    }
null
```
### C:\Users\Iluuusha\Desktop\учеба\mirea_java\src\ex_2\Ball.java
```java

    float volume = 13.37f;
null
```
### C:\Users\Iluuusha\Desktop\учеба\mirea_java\src\ex_2\Book.java
```java

    int page = 1337;
null
```
### C:\Users\Iluuusha\Desktop\учеба\mirea_java\src\ex_2\Dog.java
```java

    String nickname = "Buddy";

    public String toString() {
                "nickname='" + nickname + '\'' +
                '}';

        this.nickname = nickname;
    }
    public void setAge(int age) {
    }
    public void setNickname(String nickname) {
    }
    public int getAge() {
    }
    public String getNickname() {
    }
    public int humanAge() {
    }
null
```
### C:\Users\Iluuusha\Desktop\учеба\mirea_java\src\ex_2\DogKennel.java
```java


    ArrayList <Dog> array = new ArrayList<>();
    public void addArray(Dog obj) {
    }
    public static void main(String[] args) {
        Dog doggy = new Dog("Sharik", 12);
    }
null
```
### C:\Users\Iluuusha\Desktop\учеба\mirea_java\src\ex_2\Shape.java
```java

    String color;

    public String toString() {
                "color='" + getColor() + '\'' +
                '}';



        this.color = color;

        this.filled = filled;

        return color;

        return filled;


}
```
### C:\Users\Iluuusha\Desktop\учеба\mirea_java\src\ex_2\ShapeTest.java
```java

    public static void main(String[] args) {
        shape.setColor("blue");
        System.out.println(shape.toString());
}
```
### C:\Users\Iluuusha\Desktop\учеба\mirea_java\src\ex_3\Book.java
```java

    private String Author="Perskii";
    private int date=1967;
    public String getAuthor() {
    }
    public void setAuthor(String author) {
    }
    public String getName() {
    }
    public void setName(String name) {
    }
    public int getDate() {
    }
    public void setDate(int date) {
    }
null
```
### C:\Users\Iluuusha\Desktop\учеба\mirea_java\src\ex_3\BookTester.java
```java

    public static void main(String[] args) {
        System.out.println("Start properties:\nAuthor is "+book.getAuthor()+"\nThe name is "+ book.getName()+"\nThe date of publishing is "+book.getDate());
        book.setDate(2017);
        System.out.println("New properties:\nAuthor is "+book.getAuthor()+"\nThe name is "+ book.getName()+"\nThe date of publishing is "+book.getDate());

null
```
### C:\Users\Iluuusha\Desktop\учеба\mirea_java\src\ex_3\Circle.java
```java

    private float radius=0;
    private float posY=0;
    public void setRadius(float radius) {
    }
    public float getRadius() {
    }
    public float getPosX() {
    }
    public void setPosX(float posX) {
    }
    public float getPosY() {
    }
    public void setPosY(float posY) {
    }
null
```
### C:\Users\Iluuusha\Desktop\учеба\mirea_java\src\ex_3\CircleTester.java
```java

    public static void main(String[] args)
        Circle circle=new Circle();
        circle.setRadius(9.5f);
        circle.setPosY(4f);
    }
null
```
### C:\Users\Iluuusha\Desktop\учеба\mirea_java\src\ex_3\Hand.java
```java

    private int size=0;
    private int numberOfFingers=0;
    public int getSize() {
    }
    public void setSize(int size) {
    }
    public int getWidth() {
    }
    public void setWidth(int width) {
    }
    public int getNumberOfFingers() {
    }
    public void setNumberOfFingers(int numberOfFingers) {
    }

}
```
### C:\Users\Iluuusha\Desktop\учеба\mirea_java\src\ex_3\Head.java
```java

    private int size=0;
    private String headShape=null;
    public int getSize() {
    }
    public void setSize(int size) {
    }
    public String getHairColor() {
    }
    public void setHairColor(String hairColor) {
    }
    public String getHeadShape() {
    }
    public void setHeadShape(String headShape) {
    }
}
```
### C:\Users\Iluuusha\Desktop\учеба\mirea_java\src\ex_3\Human.java
```java

    private String name=null;
    private int weight=0;
    private Hand r_hand=null;
    private Leg r_leg=null;

        return l_hand;

        return head;

        this.head = head;

        this.l_hand = l_hand;

        return r_hand;

        this.r_hand = r_hand;

        return l_leg;

        this.l_leg = l_leg;

        return r_leg;

        this.r_leg = r_leg;

        return name;

        this.name = name;

        return height;

        this.height = height;

        return weight;

        this.weight = weight;

    public String toString() {
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", r_hand=" + r_hand +
                ", r_leg=" + r_leg +
    }
null
```
### C:\Users\Iluuusha\Desktop\учеба\mirea_java\src\ex_3\HumanTester.java
```java

    public static void main(String[] args) {
        Human human=new Human();
        System.out.println(human.toString());
        human.setHeight(184);
        Hand l_hand=new Hand();
        l_hand.setSize(19);
        Hand r_hand=new Hand();
        r_hand.setWidth(4);
        Leg l_leg=new Leg();
        l_leg.setSize(45);
        Leg r_leg=new Leg();
        r_leg.setWidth(18);
        Head head=new Head();
        head.setHeadShape("Square");
        human.setL_hand(l_hand);
        human.setL_leg(l_leg);
        human.setHead(head);
        System.out.println("Height is "+human.getHeight());
        System.out.println("Weight is "+human.getWeight());
        System.out.println("Left hand number of fingers is "+human.getL_hand().getNumberOfFingers());
        System.out.println("Left hand width is "+human.getL_hand().getWidth());
        System.out.println("Right hand properties:");
        System.out.println("Right hand size is "+human.getR_hand().getSize());

        System.out.println("Left leg number of fingers is "+human.getL_leg().getNumberOfFingers());
        System.out.println("Left leg width is "+human.getL_leg().getWidth());
        System.out.println("Right leg properties:");
        System.out.println("Right leg size is "+human.getR_leg().getSize());

        System.out.println("Head properties:");
        System.out.println("Head shape is "+human.getHead().getHeadShape());


}
```
### C:\Users\Iluuusha\Desktop\учеба\mirea_java\src\ex_3\Leg.java
```java

    private int size=0;
    private int numberOfFingers=0;
    public int getSize() {
    }
    public void setSize(int size) {
    }
    public int getWidth() {
    }
    public void setWidth(int width) {
    }
    public int getNumberOfFingers() {
    }
    public void setNumberOfFingers(int numberOfFingers) {
    }
}
```
### C:\Users\Iluuusha\Desktop\учеба\mirea_java\src\ex_4\Circle.java
```java

    double radius;
    Circle(double radius_){
    }
        super(color,filled);
    }
    public double getRadius() { return radius; }

    double getArea() { return Math.PI*Math.pow(getRadius(),2); }
    @Override

    public String toString() {
                "radius=" + radius +
                ", color = " + getColor()+
    }
null
```
### C:\Users\Iluuusha\Desktop\учеба\mirea_java\src\ex_4\Main.java
```java


        Square sq = new Square(15,"red",true);
        System.out.println(sq);
    }
null
```
### C:\Users\Iluuusha\Desktop\учеба\mirea_java\src\ex_4\Rectangle.java
```java

    protected double width, height;
        this.width = width;

    Rectangle(double width, double height, String color, boolean filled){
        this.width = width;
    }
    public Rectangle() {
    }
    public double getWidth() { return width; }
    public void setWidth(double width) { this.width = width; }
    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }
    @Override

    double getPerimeter() { return 2*(width+height); }
    @Override
        return "Rectangle{" +
                ", height=" + height +
                ", color = " + getColor()+
    }
null
```
### C:\Users\Iluuusha\Desktop\учеба\mirea_java\src\ex_4\Shape.java
```java

    String color;
    Shape(){};
        this.color = color;
    }
    public void setColor(String color) { this.color = color; }
    public void setFilled( boolean filled) { this.filled = filled; }

    abstract double getPerimeter();
null
```
### C:\Users\Iluuusha\Desktop\учеба\mirea_java\src\ex_4\Square.java
```java

    double side;
    Square(double side){
    }
        super(side,side,color,filled);

    public void setSide(double side) { this.side = side; }
    @Override
        super.width = super.height = side;
    public void setHeight(double side) {
    }
null
```
### C:\Users\Iluuusha\Desktop\учеба\mirea_java\src\ex_5\Main.java
```java

    public static void main(String[] args) {
        mc.setCenter(28, 64);
        MovableRectangle mr = new MovableRectangle(20, 60, 55, 70);

        System.out.println(mc.toString());
        System.out.println(mc.toString());
        System.out.println("Rectangle:");
        mr.setHeight(25);
        System.out.println(mr.toString());
        System.out.println(mr.toString());
    }
null
```
### C:\Users\Iluuusha\Desktop\учеба\mirea_java\src\ex_5\Movable.java
```java

    public void move(int x, int y);
null
```
### C:\Users\Iluuusha\Desktop\учеба\mirea_java\src\ex_5\MovableCircle.java
```java




        return center;

        this.center.setX(x);
    }
    @Override
        center.move(x, y);
    }
    @Override
        return "MovableCircle{" +
                '}';
}
```
### C:\Users\Iluuusha\Desktop\учеба\mirea_java\src\ex_5\MovablePoint.java
```java


    private int y;
    public void setX(int x) {
    }
    public void setY(int y) {
    }
    public int getX() {
    }
    public int getY() {
    }
    @Override
        return "MovablePoint{" +
                ", y=" + y +
    }
    @Override
        this.x+=x;
        System.out.print("Moved on "+x+" by x and "+ y+" by y");
}
```
### C:\Users\Iluuusha\Desktop\учеба\mirea_java\src\ex_5\MovableRectangle.java
```java



    private MovablePoint bottomRight = new MovablePoint();

        if (x1>x2) {
            bottomRight.setX(x1);
        else if (x2<x1)  {
            bottomRight.setX(x2);
        if (y1>y2) {
            bottomRight.setY(y2);
        else if (y2>y1) {
            bottomRight.setY(y1);

        height = topLeft.getY()-bottomRight.getY();

        return topLeft;

        return bottomRight;

    public void setHeight(double h) {
        System.out.println(" for bottom right");
    }
    @Override
        bottomRight.move((int) (w-width), 0);
        width=w;

    public String toString() {
                "topLeft=" + topLeft +
                ", width=" + width +
                '}';

    public void move(int x, int y) {
        System.out.println(" for top left");
        System.out.println(" for bottom right");
}
```
### C:\Users\Iluuusha\Desktop\учеба\mirea_java\src\ex_6\Main.java
```java


    public static void main(String[] args) {
        System.out.print("Размер поля: ");
        int Area[][] = new int[AreaSize][AreaSize];

            for (int y = 0; y < AreaSize; y++)

            for (int y = 0; y < AreaSize; y++) System.out.print(Area[x][y] + "\t");
        }
        for(int x = 0; x < AreaSize; x++)
                if(x > 0 && y > 0) Area[x][y] += Math.max(Area[x-1][y], Area[x][y-1]);
                    if(x > 0) Area[x][y] += Area[x - 1][y];
                }

        System.out.print(Area[AreaSize - 1][AreaSize - 1]);
}
```
### C:\Users\Iluuusha\Desktop\учеба\mirea_java\src\ex_7_8\Company.java
```java

import java.util.Comparator;

    private long income;
    private List<Employee> Managers = new ArrayList<Employee>();

    public void hire(Employee employee) {
            Operators.add(employee);
            Managers.add(employee);
            TopManagers.add(employee);

        hire(employee);
            hire(value);
    }
    public void fire(String position) {
            Operators.remove(Operators.size() - 1);
            Operators.remove(Operators.size() - 1);
            TopManagers.remove(TopManagers.size() - 1);

    {

        int fireNum = Operators.size() / num;
            this.fire("Operator");

        fireNum = Managers.size() / num;
            this.fire("Manager");

        fireNum = TopManagers.size() / num;
            this.fire("TopManager");

    }
    public double getIncome() {
    }
    public List<Employee> getTopSalaryStaff(int count) {
            List<Employee> Staff = new ArrayList<Employee>();
            Staff.addAll(Managers);
            if (count <= Staff.size()) {
                return Staff.subList(0, count);
            return null;
        return null;

        if (count > 0) {
            Staff.addAll(Operators);
            Staff.addAll(TopManagers);
                Staff.sort(Comparator.comparing(Employee::getTotal));
            }
        }
    }
    public void work() {
            manager.setTotal(manager.getEmployeePosition().calcSalary(manager.getSalary()));
        }
            operator.setTotal(operator.getEmployeePosition().calcSalary(operator.getSalary()));
        for (Employee topManger : TopManagers) {
        }
}
```
### C:\Users\Iluuusha\Desktop\учеба\mirea_java\src\ex_7_8\CompanyTest.java
```java


    public static void main(String[] args) {
        for (int i = 0; i < 180; i++) {
            company.hireAll(new Employee("Operator", secondName, (int) (40000 + Math.random() * 10000), new Operator()));
        for (int i = 0; i < 80; i++) {
            company.hireAll(new Employee("Manager", secondName, (int) (80000 + Math.random() * 10000), new Manager()));
        for (int i = 0; i < 10; i++) {
            company.hire(new Employee("TopManager", secondName, (int) (90000 + Math.random() * 10000), new TopManager(company)));


        for (Employee employee : company.getTopSalaryStaff(10))
            System.out.println((int) employee.getTotal() + " rub");

        for (Employee employee : company.getLowestSalaryStaff(30))
            System.out.println((int) employee.getTotal() + " rub");


        for (Employee employee : company.getTopSalaryStaff(10))
            System.out.println((int) employee.getTotal() + " rub");

        for (Employee employee : company.getLowestSalaryStaff(30))
            System.out.println((int) employee.getTotal() + " rub");

            Scanner input = new Scanner(System.in);
        }
}
```
### C:\Users\Iluuusha\Desktop\учеба\mirea_java\src\ex_7_8\Employee.java
```java

    private String name;
    private double salary;
    private EmployeePosition employeePosition;
        this.name = name;
        this.salary = salary;
    }
    public double getSalary() {
    }
    public void setSalary(double salary) {
    }
    public EmployeePosition getEmployeePosition() {
    }
    public void setEmployeePosition(EmployeePosition employeePosition) {
    }
    public void setTotal(double total) {
    }
    public double getTotal() {
    }
    public String getName() {
    }
    public void setName(String name) {
    }
    public String getSurname() {
    }
    public void setSurname(String surname) {
    }
null
```
### C:\Users\Iluuusha\Desktop\учеба\mirea_java\src\ex_7_8\EmployeePosition.java
```java

    double calcSalary(double baseSalary);
}
```
### C:\Users\Iluuusha\Desktop\учеба\mirea_java\src\ex_7_8\Manager.java
```java


    public String getJobTitle() {
    }
    @Override
        return baseSalary + 0.05 * (int) (115000 + Math.random() * 25000);
}
```
### C:\Users\Iluuusha\Desktop\учеба\mirea_java\src\ex_7_8\Operator.java
```java


    public String getJobTitle() {
    }
    @Override
        return baseSalary;
}
```
### C:\Users\Iluuusha\Desktop\учеба\mirea_java\src\ex_7_8\TopManager.java
```java

    private Company company;
    TopManager(Company company) {
    }
    @Override
        return "TopManager";

    public double calcSalary(double baseSalary) {
            return baseSalary * 2.5;
            return baseSalary;
}
```
### C:\Users\Iluuusha\Desktop\учеба\mirea_java\src\ex_9\Company.java
```java

import java.util.List;
public class Company {
    private List<Employee> employeeList = new ArrayList<>();
    public void hire(Employee employee) {
    }
    public void doSomethingWithEmployee(
            EmployeeHandler handler
        int count = 0;
            if (selector.isNeedEmployee(employee)) {
                count++;
        }
    }
null
```
### C:\Users\Iluuusha\Desktop\учеба\mirea_java\src\ex_9\Dates.java
```java

import java.time.format.DateTimeFormatter;
public class Dates {
    DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    public Dates(int day, int month, int year) {
    }
    @Override
        return f.format(ld);
}
```
### C:\Users\Iluuusha\Desktop\учеба\mirea_java\src\ex_9\Employee.java
```java

    private String firstName, lastName, place;
    private Dates dates;
    public Employee(String firstName, String secondName, String place, int number, Dates dates) {
        this.lastName = secondName;
        this.number = number;
    }
    public int getNumber() {
    }
    @Override
        return firstName +
                "," + place +
                ", " + dates;
}
```
### C:\Users\Iluuusha\Desktop\учеба\mirea_java\src\ex_9\EmployeeHandler.java
```java

    void handleEmployees(Employee employee, int index);
null
```
### C:\Users\Iluuusha\Desktop\учеба\mirea_java\src\ex_9\EmployeeSelector.java
```java

    boolean isNeedEmployee(Employee employee);
null
```
### C:\Users\Iluuusha\Desktop\учеба\mirea_java\src\ex_9\Main.java
```java

import java.util.Random;
public class Main {
        Company company = new Company();

            company.hire(new Employee(
                    "Poopkin",
                    r.nextInt(10000000),
        }
        company.doSomethingWithEmployee(
                (employee, i) -> System.out.println("employee " + i + ":" + employee));
        int m = 20_000;
            @Override
                return employee.getNumber() < m;
        }, new EmployeeHandler() {
            public void handleEmployees(Employee employee, int index) {
                System.out.println(employee);
        });
        ArrayList<Employee> selection = new ArrayList<>();
                employee -> employee.getNumber() > 1_000_000,
        System.out.println(selection + "selection");
}
```
### C:\Users\Iluuusha\Desktop\учеба\mirea_java\src\ex_9\UsageInterface.java
```java



        this.number = number;

    public boolean isNeedEmployee(Employee employee) {
    }
null
```
