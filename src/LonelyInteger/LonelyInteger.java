package LonelyInteger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LonelyInteger {
    public static int lonelyinteger(List<Integer> a) {
        int x = 0;
        for (int i : a) {
            if (Collections.frequency(a, i) == 1) {
                x = i;
                break;
            }
        }
        return  x;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        lonelyinteger(list);

    }
}
