package ex_25_26;

public class Main {
    public static void main(String[] args) {
        SuperHashMap<Integer, String> superHashMap = new SuperHashMap<>();
        superHashMap.add(322, "Solo");
        superHashMap.add(1337, "leet");
        superHashMap.add(1488, "stop it!");
        superHashMap.add(69, "nice");
        superHashMap.add(420, "weed");
        System.out.println("Get key 322: value=" + superHashMap.get(322));
        System.out.println("Get key 1337: value=" + superHashMap.get(1337));
        System.out.println("Get key 69: value=" + superHashMap.get(69));
        System.out.println("Remove key 1488: value=" + superHashMap.remove(1488));
        superHashMap.add(1488, "NOOOOO");
        System.out.println("Get key 1488: value=" + superHashMap.get(1488));
        for (String V : superHashMap) {
            System.out.println(V);
        }
        SuperHashMap<String, Integer> test = new SuperHashMap<>();
        test.add("wat", -123);
    }
}
