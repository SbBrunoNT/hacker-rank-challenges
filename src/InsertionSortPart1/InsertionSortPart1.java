package InsertionSortPart1;

import java.util.List;

public class InsertionSortPart1 {
    public static void insertionSort1(int n, List<Integer> arr) {

        for (int j = 1; j < arr.size(); j++) {
            int current = arr.get(j);
            int i = j-1;
            while ((i > -1) && ((arr.get(i).compareTo(current)) == 1)) {
                arr.set(i+1, arr.get(i));
                i--;
                System.out.println(arr.toString().replace("[", "").replace("]" , "").replace(",", ""));
            }
            arr.set(i+1, current);

        }
        System.out.println(arr.toString().replace("[", "").replace("]" , "").replace(",", ""));
    }

    public static void main(String[] args) {

    }

}
