import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Ch2806 {
    public static void main(String[] args) {
        Integer coine[] = {1, 2, 5, 10, 20, 50, 100, 200, 500, 2000};
        
        Arrays.sort(coine, Comparator.reverseOrder());
        
        int countOfcoin = 0;
        int amount = 590;
        ArrayList<Integer> note = new ArrayList<>();

        for(int i=0; i<coine.length; i++){
            if (coine[i] <= amount) {
            while (coine[i] <= amount) {
                countOfcoin++;
                note.add(coine[i]);
                amount -= coine[i];
            }
            }
        }
        System.out.println(countOfcoin);
       
    }
    
}
