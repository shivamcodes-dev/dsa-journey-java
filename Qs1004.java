public class Qs1004 {
    public static void main(String[] args) {
        /*19. Frequency of Elements in an Array
    Description: Count occurrences of each element in an array.
    Example:
     Input: [1, 2, 2, 3, 3, 3]
     Output: 1:1 2:2 3:3 */

     int arr[] = {1, 2, 2, 3, 3, 3};
     int skip = Integer.MIN_VALUE;
     for (int i = 0; i < arr.length-1; i++) {
        if (arr[i] == skip) {
            continue;
        }
        int fre = 1;
        for (int j = i+1; j < arr.length; j++) {
            if (arr[i] == arr[j]) {
                fre++;
                skip = arr[j];
            }
        }
        System.out.println(arr[i] + ": " + fre);
     }

    }
    
}
