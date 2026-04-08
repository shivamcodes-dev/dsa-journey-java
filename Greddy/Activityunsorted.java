package Greddy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Activityunsorted {
    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };

        // sort 2 d array;
        int activityes[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activityes[i][0] = i;
            activityes[i][1] = start[i];
            activityes[i][2] = end[i];
        }
        Arrays.sort(activityes, Comparator.comparingDouble(o -> o[2]));

        // sorted in end basic
        int maxact = 0;
        ArrayList<Integer> actidx = new ArrayList<>();

        maxact = 1;
        actidx.add(0);
        int prevact = activityes[0][2];
        for (int i = 1; i < end.length; i++) {
            // activity selected
            if (activityes[i][1] >= prevact) {
                maxact++;
                actidx.add(activityes[i][0]);
                prevact = activityes[i][2];
            }
        }
        System.out.println(maxact);
        for (int i = 0; i < actidx.size(); i++) {
            System.out.println("A" + actidx.get(i) + " ");
        }
    }
}
