import java.util.ArrayList;

public class Ch2305 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2); 
        list.add(3); 
        list.add(5); 
        list.add(4);
        mainlist.add(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(12); 
        list2.add(13); 
        list2.add(15); 
        list2.add(14);
        mainlist.add(list2);

        for (int i = 0; i < mainlist.size(); i++) {
            ArrayList<Integer> currlist = mainlist.get(i);
            for (int j = 0; j < currlist.size(); j++) {
                System.out.print(currlist.get(j) + "  ");
            }
            System.out.println();   
        }   
        
        } 
}
