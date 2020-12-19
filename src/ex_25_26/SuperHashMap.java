package ex_25_26;

import java.util.Iterator;

import java.util.ArrayList;

public class SuperHashMap<K, V> implements ISuperHashMap<K, V> {
    private ArrayList<ArrayList<KeyValue<K, V>>> superHashMap;
    private int size = 128;

    public SuperHashMap() {
        superHashMap = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            superHashMap.add(new ArrayList<>());
        }
    }

    @Override
    public void add(K key, V value) {
        System.out.println(key.hashCode());
        int index = Math.abs(key.hashCode() % superHashMap.size());
        System.out.println(index);
        if(superHashMap.get(index).size()==0){
            superHashMap.get(index).add(new KeyValue<>(key, value));
        }
        else{
            for (int i = 0; i < superHashMap.get(index).size(); i++) {
                if(superHashMap.get(index).get(i).getKey().equals(key)){
                    superHashMap.get(index).set(i, new KeyValue<>(key, value));
                    break;
                }
            }
        }
    }

    @Override
    public V get(K key) {
        int index = Math.abs(key.hashCode() % superHashMap.size());
        for (int i = 0; i < superHashMap.get(index).size(); i++) {
            if(superHashMap.get(index).get(i).getKey().equals(key)){
                return superHashMap.get(index).get(i).getValue();
            }
        }
        return null;
    }

    @Override
    public V remove(K key) {
        int index = Math.abs(key.hashCode() % superHashMap.size());
        for (int i = 0; i < superHashMap.get(index).size(); i++) {
            if(superHashMap.get(index).get(i).getKey().equals(key)){
                Object temp = superHashMap.get(index).get(i).getValue();
                superHashMap.get(index).remove(superHashMap.get(index).get(i));
                return (V) temp;
            }
        }
        return null;
    }

    @Override
    public Iterator<V> iterator() {
        return new CustomIterator();
    }

    public class CustomIterator implements Iterator<V>{
        private int currentArray = 0, currentIndex = 0;

        @Override
        public boolean hasNext() {
            if (currentIndex == superHashMap.get(currentArray).size()) {
                currentIndex = 0;
                currentArray++;
                while (currentArray < size && superHashMap.get(currentArray).size() == 0) {
                    currentArray++;
                }
            }
            return currentArray < size;
        }

        @Override
        public V next() {
            return superHashMap.get(currentArray).get(currentIndex++).getValue();
        }
    }
}
