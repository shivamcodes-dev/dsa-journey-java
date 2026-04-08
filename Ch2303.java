import java.util.ArrayList;
public class Ch2303 {

public static void swap(ArrayList<Integer> num, int idx1, int idx2){
    int temp = num.get(idx1);
    num.set(idx1, num.get(idx2));
    num.set(idx2, temp);
}


    public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
     list.add(7);
     list.add(2);
     list.add(5);
     list.add(9);
     list.add(3);

     int idx1=1, idx2 = 3;
     System.out.println(list);
     swap(list, idx1, idx2);
     System.out.println(list);
    }
    
}
