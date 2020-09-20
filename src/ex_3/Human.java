package ex_3;

public class Human {
    private String name=null;
    private int height=0;
    private int weight=0;
    private Hand l_hand=null;
    private Hand r_hand=null;
    private Leg l_leg=null;
    private Leg r_leg=null;
    private Head head;

    public Hand getL_hand() {
        return l_hand;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public void setL_hand(Hand l_hand) {
        this.l_hand = l_hand;
    }

    public Hand getR_hand() {
        return r_hand;
    }

    public void setR_hand(Hand r_hand) {
        this.r_hand = r_hand;
    }

    public Leg getL_leg() {
        return l_leg;
    }

    public void setL_leg(Leg l_leg) {
        this.l_leg = l_leg;
    }

    public Leg getR_leg() {
        return r_leg;
    }

    public void setR_leg(Leg r_leg) {
        this.r_leg = r_leg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", l_hand=" + l_hand +
                ", r_hand=" + r_hand +
                ", l_leg=" + l_leg +
                ", r_leg=" + r_leg +
                '}';
    }
}
