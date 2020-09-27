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