package Generics;

import java.util.Arrays;

//public class CustomArrayList<T extends Number> {
    public class CustomArrayList<T> {
    private Object[] data;
    private int DEFAULT_SIZE = 10;
    private int size;

    public CustomArrayList() {
        data = new Object[DEFAULT_SIZE];
    }

    public void add(T num) {
        if(ifFull()) {
            reSize();
        }
        data[size++] = num;
    }
    private boolean ifFull() {
        return data.length == size;
    }
    private void reSize() {
        Object[] temp = new Object[data.length*2];
        for(int i=0;i<data.length;i++) {
            temp[i] = data[i];
        }
        data = temp;
    }
    public T remove() {
        return (T)data[--size];
    }
    public T get(int index) {
        return (T)data[index];
    }
    public void set(int index,T value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", DEFAULT_SIZE=" + DEFAULT_SIZE +
                ", size=" + size +
                '}';
    }
}
