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
