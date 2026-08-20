package ArrayList;

import java.util.ArrayList;

public class FindMax {

    public static int findMaximum(ArrayList<Integer> arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, arr.get(i));
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(4);
        array.add(7);
        array.add(1);
        array.add(47);
        array.add(-94);
        array.add(14);

        System.out.println(findMaximum(array));
    }

}
