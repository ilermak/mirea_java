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
