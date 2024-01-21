package com.adozgen.learnjava.generics;

public class Pair<K extends Comparable<K>, V extends Comparable<V>> implements Comparable<Pair<K, V>>{
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public int compareTo(Pair<K, V> o) {
        int ketCompare = key.compareTo(o.key);
        if (ketCompare != 0){
            return ketCompare;
        }
        return value.compareTo(o.value);
    }
}
