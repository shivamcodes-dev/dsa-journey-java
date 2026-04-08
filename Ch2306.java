import java.util.ArrayList;

public class Ch2306 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> table1 = new ArrayList<>();
        ArrayList<Integer> table2 = new ArrayList<>();
        ArrayList<Integer> table3 = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            table1.add(i*1);
            table2.add(i*2);
            table3.add(i*3);
        }
        mainlist.add(table1);
        mainlist.add(table2);
        mainlist.add(table3);
        System.out.println(mainlist);

        for (int i = 0; i < mainlist.size(); i++) {
            ArrayList<Integer> currlist = mainlist.get(i);
            for (int j = 0; j < currlist.size(); j++) {
                System.out.print(currlist.get(j) + " ");
            }
            System.out.println();
        }

    }
    
}
