package CustomArraylist;

import java.util.Arrays;

public class Customlist {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public Customlist() {
        this.data = new int[DEFAULT_SIZE];
    }
    public void add(int num) {
        if(isFull()) {
            resize();
        }
        data[size++] = num;
    }
    private boolean isFull() {
        return data.length == size;
    }
    private void resize() {
        int[] temp = new int[data.length*2];
        for(int i=0;i<data.length;i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public int remove() {
        int removed = data[--size];
        return removed;
    }
    public int get(int index) {
        return data[index];
    }
    public void set(int index,int value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "Customlist{" +
                "data=" + Arrays.toString(data) +

                '}';
    }
}
