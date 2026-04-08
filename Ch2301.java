import java.util.ArrayList;
public class Ch2301 {
    public static void main(String[] args) {
        //declear
     ArrayList<Integer> Shivam = new ArrayList<>();
     ArrayList<Boolean> list = new ArrayList<>();
     ArrayList<String> list2 = new ArrayList<>();
     
                //operations

        //add
     Shivam.add(2);
     Shivam.add(4);
     Shivam.add(3);
     Shivam.add(5);
     System.out.println(Shivam);

     Shivam.add(2,44);
     System.out.println(Shivam);


        //Access at index
     int ele = Shivam.get(2);
    int ele2 = Shivam.get(0);
    System.out.println(ele);
    System.out.println(ele2);

    //remove
    Shivam.remove(3);
    System.out.println(Shivam);

    //Set
    Shivam.set(2, 11);
    System.out.println(Shivam);


    //cheack if exesit

    boolean j = Shivam.contains(10);
    System.out.println(j);

     ////size
        int n = Shivam.size();
        System.out.println(n);


        // Shivam.remove(2);//3


    }
}
