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