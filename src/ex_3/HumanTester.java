package ex_3;

public class HumanTester {
    public static void main(String[] args) {

        Human human=new Human();
        System.out.println("Start properties:");
        System.out.println(human.toString());
        human.setName("Iisac");
        human.setHeight(184);
        human.setWeight(79);
        Hand l_hand=new Hand();
        l_hand.setNumberOfFingers(5);
        l_hand.setSize(19);
        l_hand.setWidth(5);
        Hand r_hand=new Hand();
        r_hand.setSize(19);
        r_hand.setWidth(4);
        r_hand.setNumberOfFingers(5);
        Leg l_leg=new Leg();
        l_leg.setNumberOfFingers(1);
        l_leg.setSize(45);
        l_leg.setWidth(19);
        Leg r_leg=new Leg();
        r_leg.setSize(45);
        r_leg.setWidth(18);
        r_leg.setNumberOfFingers(2);
        Head head=new Head();
        head.setHairColor("Red");
        head.setHeadShape("Square");
        head.setSize(99);
        human.setL_hand(l_hand);
        human.setR_hand(r_hand);
        human.setL_leg(l_leg);
        human.setR_leg(r_leg);
        human.setHead(head);
        System.out.println("New properties:");
        System.out.println("Height is "+human.getHeight());
        System.out.println("Name is "+human.getName());
        System.out.println("Weight is "+human.getWeight());
        System.out.println("Left hand properties:");
        System.out.println("Left hand number of fingers is "+human.getL_hand().getNumberOfFingers());
        System.out.println("Left hand size is "+human.getL_hand().getSize());
        System.out.println("Left hand width is "+human.getL_hand().getWidth());

        System.out.println("Right hand properties:");
        System.out.println("Right hand number of fingers is "+human.getR_hand().getNumberOfFingers());
        System.out.println("Right hand size is "+human.getR_hand().getSize());
        System.out.println("Right hand width is "+human.getR_hand().getWidth());

        System.out.println("Left leg properties:");
        System.out.println("Left leg number of fingers is "+human.getL_leg().getNumberOfFingers());
        System.out.println("Left leg size is "+human.getL_leg().getSize());
        System.out.println("Left leg width is "+human.getL_leg().getWidth());

        System.out.println("Right leg properties:");
        System.out.println("Right leg number of fingers is "+human.getR_leg().getNumberOfFingers());
        System.out.println("Right leg size is "+human.getR_leg().getSize());
        System.out.println("Right leg width is "+human.getR_leg().getWidth());


        System.out.println("Head properties:");
        System.out.println("Head hair color is "+human.getHead().getHairColor());
        System.out.println("Head shape is "+human.getHead().getHeadShape());
        System.out.println("Head size is "+human.getHead().getSize());



    }
}