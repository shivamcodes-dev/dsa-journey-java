import java.util.Arrays;
import java.util.Comparator;

public class Ch2803 {
    public static void main(String[] args) {
        int weight[] = {10, 20, 30};
        int value[] = {60, 100, 120};
        int w = 50;

        double ratio[][] = new double[weight.length][2];
        // 1st col me index, aur 2nd col me ratio
        for (int i=0; i<weight.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = value[i]/(double)weight[i];
        }

        Arrays.sort(ratio, Comparator.comparing(o -> o[1]));
        // sorting in assinding order;

          int capacity = w;
          int finalAns = 0;
        for (int i=ratio.length-1; i>=0; i--) {
            int idx = (int)ratio[i][0];
            if (capacity >= weight[idx]) {
               finalAns += value[idx];
               capacity -= weight[idx];
            }else{
                finalAns += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }
        System.out.println("Max Profit : " + finalAns);

    }
    
}
