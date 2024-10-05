package Test;

import java.util.Arrays;

public class CustomGenericArrayList {

    private static final int DEFAULT_SIZE = 10;
    private int[] data;
    private int size = 0;

    public CustomGenericArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public static void main(String[] args) {
        CustomGenericArrayList list = new CustomGenericArrayList();

        for (int i = 0; i < 12; i++) {
            list.add(i * 2);
        }
        System.out.println(list);
    }

    public void add(int num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];
        System.arraycopy(data, 0, temp, 0, data.length);
        data = temp;
    }

    public int get(int index) {

        return data[index];
    }

    private boolean isFull() {
        return size == data.length;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }
}
