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