import java.util.ArrayList;

public class Ch2801 {
    public static void main(String[] args) {
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9}; // sorted ending time

        int maxact = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // matlab phla Activity hogya to maxAct =1; aur ans ArrayList me (store the index)
        maxact = 1;
        ans.add(0);

        int lastEnd = end[0]; // ye 
        for (int i=1; i<end.length; i++) {
            if (start[i] >= lastEnd) {
                //activity Selected
                maxact++;
                ans.add(i);
                lastEnd = end[i];
            }
        }
        System.out.println("Max Activities : " + maxact);
        for (int i=0; i<ans.size(); i++) {
            System.out.println("A" + ans.get(i));
        }
    }
}
