package ClassActivities.Searching;

import java.util.ArrayList;

public class MyHashMap <K, V> implements SimpleMap<K, V>{

    private ArrayList<KeyValue<K, V>>[] array;

    public MyHashMap(int size) {
        array = (ArrayList<KeyValue<K,V>>[]) new ArrayList[size];
    }

    @Override
    public void put(K key, V value) {
        int hash = key.hashCode();
        int index = mod(hash, array.length);
        ArrayList<KeyValue<K, V>> list = array[index];

        if(list == null){
            list = new ArrayList<>();
            array[index] = list;
        }
        for(KeyValue kv : list ){
            if(kv.key.equals(key)){
                kv.value = value;
                return;
            }
        }
        list.add(new KeyValue<>(key, value));
    }

    @Override
    public V get(K key) {
        int hash = key.hashCode();
        int index = mod(hash, array.length);
        ArrayList<KeyValue<K, V>> list = array[index];
        if(list == null){
            return null;
        }
        for (KeyValue kv : list) {
            if(kv.key.equals(key)){
                return (V) kv.value;
            }
        }
        return null;
    }

    private static int mod(int x, int y){
        int z = x % y;
        return z < 0 ? z + y : z;
    }

    private static class KeyValue<K, V>{
        public final K key;
        public V value;

        private KeyValue(K key, V value){
            this.key = key;
            this.value = value;
        }
    }
}
