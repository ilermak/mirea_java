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
