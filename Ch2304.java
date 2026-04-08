import java.util.ArrayList;
import java.util.Collections;

public class Ch2304 {
    public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
     list.add(7);
     list.add(2);
     list.add(5);
     list.add(9);
     list.add(3);
     System.out.println(list);
     //sort in Assinding order
     Collections.sort(list);
     System.out.println(list);

     //destending order
     Collections.sort(list, Collections.reverseOrder());
     System.out.println(list);

    }
}
