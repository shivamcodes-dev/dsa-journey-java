package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(6);
        list.add(2);
        list.add(16);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder()); // desending order
        System.out.println(list);

    }

}
