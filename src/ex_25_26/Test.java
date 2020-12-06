package ex_25_26;

public class Test<K,V> {
    private K key;
    private V value;
    Test<K,V> next=null;

    public boolean hasNext(){
        return next != null;
    }

    public Test(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public Test<K, V> getNext() {
        return next;
    }

    public void setNext(Test<K, V> next) {
        this.next = next;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

}