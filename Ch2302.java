import java.util.ArrayList;

public class Ch2302 {
    public static void main(String[] args) {
          ArrayList<Integer> list = new ArrayList<>();
     list.add(7);
     list.add(2);
     list.add(5);
     list.add(9);
     list.add(3);
    
        //Reverse 
        /* 
    for(int i=list.size()-1; i>=0; i--){
        System.out.println(list.get(i));
    }
    */
    

    //max num

    int max = Integer.MIN_VALUE;
    for(int i=0; i<list.size(); i++){
        if(list.get(i)>max){
            max = list.get(i);
        }
    }
    System.out.println(max);


}
}
