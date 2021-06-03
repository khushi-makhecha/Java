package com.khushi.generics;

public class KeyValuePrint <K,V> {
    private K key;
    private V value;

    public KeyValuePrint(K key, V value) {
        this.key = key;
        this.value = value;
    }
}