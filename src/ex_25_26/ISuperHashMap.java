package ex_25_26;

public interface ISuperHashMap<K,V> extends Iterable<V> {
    void add(K key, V value);
    V get(K key);
    V remove(K key);
}