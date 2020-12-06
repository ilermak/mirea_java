package ex_25_26;

public class Main {
    public static void main(String[] args) {
        SuperHashMap<String,Integer> test = new SuperHashMap<>();
        test.add("Solo",322);
        test.add("Leet",1337);
        test.add("Stop it!",1488);
        test.add("First",1);
        test.add("Nice!",69);
        test.add("zxc",333);
        System.out.println("==========================");
        for (Test k : test) {
            System.out.println(k.getValue());
        }
        System.out.println("==========================");
        System.out.println(test.get("First"));
        System.out.println("remove First: " + test.remove("First"));
        for (Test k : test) {
            System.out.println(k.getValue());
        }
    }

}
