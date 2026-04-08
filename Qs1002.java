import java.lang.reflect.Array;
import java.util.Arrays;

public class Qs1002 {
    public static void main(String[] args) {
        int input[] = {2, 3, 4, 5, 6};
        int output[] = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            int prod ;
            if (i == 0) {
                prod = input[i] * input[i+1];    
            }else if(i == (input.length-1)){
                prod = input[i] * input[i-1];
            }else{
                prod = input[i-1] * input[i+1];
            }
            output[i] = prod;
            
        }
        System.out.println(Arrays.toString(output));
    }
    
    
}
