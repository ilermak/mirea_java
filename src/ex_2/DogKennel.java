package ex_2;

import java.util.ArrayList;

class DogKennel {
    ArrayList <Dog> array = new ArrayList<>();

    public void addArray(Dog obj) {
        array.add(obj);
    }

    public static void main(String[] args) {
        DogKennel kennel = new DogKennel();
        Dog doggy = new Dog("Sharik", 12);
        kennel.addArray(doggy);
    }
}