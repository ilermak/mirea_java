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