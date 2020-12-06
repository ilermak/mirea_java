package ex_25_26;

import java.util.Iterator;

public class SuperHashMap<K,V> implements ISuperHashMap<K,V> {
    private final int capacity = 128;
    Test<K,V>[] buckets;
    Test<K,V> curPtr;
    int bucketIndex = 0;


    public SuperHashMap() {
        buckets = new Test[capacity];
    }

    public int keyHash(K key){
        return key.hashCode()>>2;
    }

    @Override
    public void add(K key, V value) {
        int bucket = keyHash(key)%capacity;
        Test<K,V> ptr = buckets[bucket];
        if(ptr != null){
            while(ptr.hasNext()) ptr = ptr.getNext();
            ptr.setNext(new Test<>(key,value));
        } else {
            buckets[bucket] = new Test<>(key,value);
        }
        int i = 0;
        while(buckets[i]==null) i++;
        curPtr = buckets[i];
        bucketIndex=i;
    }

    @Override
    public V get(K key) {
        int bucket = keyHash(key)%capacity;
        Test<K,V> ptr = buckets[bucket];
        if(ptr!=null){
            while(!key.equals(ptr.getKey())) {
                ptr = ptr.getNext();
                if(ptr==null) break;
            }
        }
        if(ptr!=null) return ptr.getValue();
        return null;
    }

    @Override
    public V remove(K key) {
        int bucket = keyHash(key)%capacity;
        Test<K,V> ptr = buckets[bucket];
        if(ptr==null) return null;
        if (key.equals(ptr.getKey())) {
            buckets[bucket] = ptr.getNext();
            return ptr.getValue();
        }
        while(!key.equals(ptr.getNext().getKey())) {
            ptr = ptr.getNext();
            if(ptr.getNext() == null) break;
        }
        return ptr.getValue();
    }
    class HashIterator implements Iterator<Test<K, V>> {
        private final SuperHashMap<K,V> ht;

        HashIterator(SuperHashMap<K,V> ht){
            this.ht = ht;
        }
        @Override
        public boolean hasNext() {
            if(curPtr!=null) {
                if (curPtr.getNext() != null) {
                    return true;
                } else if (bucketIndex < ht.capacity - 1) {

                    return buckets[bucketIndex] != null;
                }
            }
            int i = 0;
            while(i<capacity-1&&buckets[i]==null) i++;
            curPtr = buckets[i];
            bucketIndex=i;
            return false;
        }

        @Override
        public Test<K, V> next() {
            if (curPtr.getNext() != null) {
                return curPtr = curPtr.getNext();
            } else
            {
                Test k = buckets[bucketIndex];
                int i = bucketIndex+1;
                while(i<capacity-1&&buckets[i]==null) i++;
                curPtr = buckets[i];
                bucketIndex=i;
                return k;
            }
        }
    }
    @Override
    public Iterator<Test<K, V>> iterator() {
        return new HashIterator(this);
    }

}
