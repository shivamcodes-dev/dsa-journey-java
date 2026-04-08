import java.util.Arrays;

public class Ch2804 {
    public static void main(String[] args) {
        int arr[] = {4, 1, 8, 7};
        int arr2[] = {2, 3, 6, 5};
        Arrays.sort(arr);
        Arrays.sort(arr2);

        int minDiff = 0;

        for (int i = 0; i < arr2.length; i++) {
            if (arr[i] > arr2[i]) {
                minDiff +=(arr[i] - arr2[i]); 
            }else{
                minDiff +=(arr2[i] - arr[i]); 
            }
        }
        System.out.println(minDiff);
    }
    
}
