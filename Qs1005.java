import java.util.Arrays;

public class Qs1005 {

        /* Minimum Value to Balance an Array
    Description: Find the minimum value to add to balance an array. Given an array of even size, task is to find 
    minimum value that can be added to an element so that array become balanced.
    * An array is balanced if the sum of the left half of the array elements is equal to the sum of right half. 
      Suppose, we have an array 1 3 1 2 4 3.
    * The Sum of first three elements is 1 + 3 + 1 = 5 and sum of last three elements is 2 + 4 + 3 = 9 
    * So this is unbalanced, to make it balanced the minimum number we can add is 4 to any element in first half.*/
    public static int balance(int[] arr){
         int fsum = 0, ssum = 0;
         for (int i = 0; i < arr.length/2; i++) {
            fsum+=arr[i];   
         }
         for (int i = arr.length/2; i<arr.length; i++) {
            ssum+=arr[i];
         }
         // int diff = fsum - ssum;
         // System.out.println(Math.abs(diff));
         return Math.abs(fsum-ssum);  
    }


    /*21. Move Zeroes to Right, Ones to Left
    Description: Shift all zeroes to the right and ones to the left.
    Example:
     Input: [0, 1, 0, 1, 1]
     Output: [1, 1, 1, 0, 0] */
     public static int[] moveZero(int[] arr){
      int i=0, j=0;
      while (i<arr.length) {
       if(arr[i] != 0){
         int temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
         j++;
       }
         i++;
      } 
      return arr;
     }
    public static void main(String[] args) {
         int arr[] = {0, 1, 0, 1, 1};
         // balance(arr);
         moveZero(arr);
         System.out.println(Arrays.toString(arr));


    }
    
}
