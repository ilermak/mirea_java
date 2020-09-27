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