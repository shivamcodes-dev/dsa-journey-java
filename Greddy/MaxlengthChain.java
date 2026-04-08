package Greddy;

import java.util.Arrays;
import java.util.Comparator;

public class MaxlengthChain {
    public static void main(String[] args) {
        int pairs[][] = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };

        Arrays.sort(pairs, Comparator.comparingInt(o -> o[1]));

        int chainlen = 1;
        int pairend = pairs[0][1];
        for (int i = 0; i < pairs.length; i++) {
            if (pairs[i][0] >= pairend) {
                chainlen++;
                pairend = pairs[i][1];
            }
        }

        System.out.println(chainlen);
    }
}
