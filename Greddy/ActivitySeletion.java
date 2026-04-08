package Greddy;

import java.util.ArrayList;

public class ActivitySeletion {
    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };

        // sorted in end basic
        int maxact = 0;
        ArrayList<Integer> actidx = new ArrayList<>();

        maxact = 1;
        actidx.add(0);
        int prevact = end[0];
        for (int i = 1; i < end.length; i++) {
            // activity selected
            if (start[i] >= prevact) {
                maxact++;
                actidx.add(i);
                prevact = end[i];
            }
        }
        System.out.println(maxact);
        for (int i = 0; i < actidx.size(); i++) {
            System.out.println("A" + actidx.get(i) + " ");
        }
    }
}
