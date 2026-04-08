package Greddy;

import java.util.Arrays;
import java.util.Comparator;

public class FreactionalKnpsk {
    public static void main(String[] args) {
        int value[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };
        int w = 50;

        double ratio[][] = new double[value.length][2];

        for (int i = 0; i < value.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = (double) value[i] / weight[i];
        }

        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = w;
        int ans = 0;
        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];// ratio are alredy sorted in assending order idx for find those index where
                                        // profit is high;
            if (capacity >= weight[idx]) {
                ans += value[idx];
                capacity -= weight[idx];
            } else {
                // include freation item
                ans += (ratio[i][1] * capacity); // i kyu idx kyu nahi
                capacity = 0;
                break;
            }
        }
        System.out.println(ans);
    }
}
