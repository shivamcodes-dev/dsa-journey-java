import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Ch2802 {
    public static void main(String[] args) {
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9}; // not sorted ending time

        int activities [][] = new int[start.length][3]; //col 3 esiliye kyu ki ek index, ek start time, ek last time
        for(int i=0; i<start.length; i++){
            activities[i][0] = i;   // 1st for indexing 
            activities[i][1] = start[i]; // 2nd col for start
            activities[i][2] = end[i];  // 3rd col for end
        }

        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        int maxact = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // matlab phla Activity hogya to maxAct =1; aur ans ArrayList me (store the index)
        maxact = 1;
        ans.add(activities[0][0]); //(0)

        int lastEnd = activities[0][2]; // ye 
        for (int i=1; i<end.length; i++) {
            if (activities[i][1] >= lastEnd) {
                //activity Selected
                maxact++;
                ans.add(i);
                lastEnd = activities[i][2];
            }
        }
        System.out.println("Max Activities : " + maxact);
        for (int i=0; i<ans.size(); i++) {
            System.out.println("A" + ans.get(i));
        }
    }
    
}
