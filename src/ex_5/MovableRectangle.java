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
