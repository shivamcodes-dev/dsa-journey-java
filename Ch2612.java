import java.util.Stack;

public class Ch2612 {
       public static void stackSpam(int []arr, int[] span){
      
        Stack<Integer> s = new Stack<>();
        
        span[0] = 1;
        s.push(0);

        for (int i = 1; i < arr.length; i++) {
            int currPrice = arr[i];
            while (!s.empty() && currPrice > arr[s.peek()]) {
                s.pop();
            }
            if (s.empty()) {
                span[i] = i+1;
            }else{
                int prevHeig = s.peek();
                span[i] = i-prevHeig;
            }
            s.push(i);
        }
    }
    public static void main(String[] args) {
        int stocks[] = {100, 80, 60, 70, 60, 85, 100};
        int span[] = new int[stocks.length];
        stackSpam(stocks, span);
        for (int i = 0; i < span.length; i++) {
            System.out.print(span[i]+", ");
        }System.out.println();
        String s = "uruii";
        
        
    } 
}
