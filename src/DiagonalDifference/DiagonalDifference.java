package DiagonalDifference;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        arr = new ArrayList<>(3);
        for(int i=0; i < 3; i++) {
            arr.add(new ArrayList());
        }
        int d1 = 0;
        int d2 = 0;

        for (int i = 0; i < arr.size(); i++) {
            d1 += arr.get(i).get(i);
            d2 += arr.get(arr.size() - 1 - i).get(i);
        }

        return Math.abs(d1 - d2);
    }

    public static void main(String[] args) {
        List<Integer> integerList1 = new ArrayList<>();
        List<Integer> integerList2 = new ArrayList<>();
        integerList1.add(1);
        integerList1.add(2);
        integerList2.add(4);
        integerList2.add(5);
        List<List<Integer>> superList = new ArrayList<>();
        superList.add(integerList1);
        superList.add(integerList2);
        Integer firstElement = superList.get(0).get(0);
        Integer secondElement = superList.get(1).get(1);
        var result = Math.abs(firstElement+ secondElement);
        diagonalDifference(superList);
        // 1 2
        // 4 5
    }
}
