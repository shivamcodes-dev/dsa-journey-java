import java.util.*;

public class Ch1302 {

    public static int BinarySearch(int arr[], int key){
        int start=0, end=arr.length-1;
        
        while(start<=end){
            int mid = (start+end)/2;

            //camperision
            if(arr[mid] == key){//found
                return mid;
            }
            if(arr[mid] < key){
                start = mid+1;
            }else{
                end = mid-1;
            }
        } return -1;
    }


    public static void main(String[] args) {
        int arry[] = {2, 4, 6, 8, 10, 12, 14, 17, 22};
        int ans = BinarySearch(arry, 144);
        System.out.println(ans);
    }
    
}
