public class Qs1001 {
    /*Minimum of (a+b, c) from Two Arrays

    Description: Given an integer array A[] and a character array B[] of equal lengths where every character of  
    the array is from the set {‘a’, ‘b’, ‘c’}. Elements of both arrays are associated with each other i.e. the 
    value of B[i] is linked to A[i] for all valid values of i. The task is to find the value min(a + b, c).
    Example:
       Input: A[] = {3, 6, 4, 5, 6}, B[] = {‘a’, ‘c’, ‘b’, ‘b’, ‘a’}
       Output: 6 */

       public static void main(String[] args) {
        int num[] = {3, 6, 4, 5, 6};
        char ch[] = {'a', 'c', 'b', 'b', 'a'};
        int x=Integer.MAX_VALUE;
        int y=Integer.MAX_VALUE;
        int z=Integer.MAX_VALUE;

        for (int i = 0; i < num.length; i++) {
              switch (ch[i]) {
                case  'a': 
                x = Math.min(x, num[i]);
                    break;

                    case  'b': 
                    y = Math.min(y, num[i]);
                    break;

                    case  'c': 
                    z = Math.min(z, num[i]);
                    break;

                default:
                    break;
              }
        }
        int result = Math.min((x+y), z);
        System.out.println(result);
       }
    
}
