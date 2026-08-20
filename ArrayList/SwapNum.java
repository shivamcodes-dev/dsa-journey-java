package ArrayList;

import java.util.ArrayList;

public class SwapNum {

    public static void swapTwoNum(ArrayList<Integer> num, int i, int j) {
        int temp = num.get(i);
        num.set(i, num.get(j));
        num.set(j, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(6);
        list.add(2);
        list.add(16);
        System.out.println(list);

        int i = 1, j = 4;
        swapTwoNum(list, i, j);
        System.out.println(list);
    }

}
