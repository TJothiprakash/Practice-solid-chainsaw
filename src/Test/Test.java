package Test;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list);
    }
}
