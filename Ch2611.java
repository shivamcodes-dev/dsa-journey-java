import java.util.Stack;

public class Ch2611 {


    //ADD A ELEMENT AT LAST
    public static void pushAtLast(Stack<Integer> s, int data){

        if (s.empty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtLast(s, data);
          s.push(top);
    }


    // REVERSE A STRING USGING STACK
    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while (idx<str.length()) {
            StringBuilder sr = new StringBuilder();
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder sr = new StringBuilder("");
        while (!s.isEmpty()) {
            char curr = s.pop();
            sr.append(curr);
        }
        str = sr.toString();
        return str;
    }

    public static void reverseStack(Stack<Integer> s){
        if(s.empty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtLast(s, top);
    }

    public static void printStack(Stack<Integer> s){
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }


    // public static void stackSpam(int []arr, int[] span){
      
    //     Stack<Integer> s = new Stack<>();
    //     span[0] = 1;
    //     s.push(0);

    //     for (int i = 0; i < arr.length; i++) {
    //         int currPrice = arr[i];
    //         while (!s.empty() && arr[s.peek()] > currPrice) {
    //             s.pop();
    //         }
    //         if (!s.empty()) {
    //             span[i] = i+1;
    //         }else{
    //             int prevHeig = s.peek();
    //             span[i] = i-prevHeig;
    //         }
    //         s.push(i);
    //     }
    // }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        // atIndexLast(s, 41);
        // while (!s.isEmpty()) {
        //     System.out.println(s.pop());
        // }
        // String str = "Hello Bhai log :)";        
        // System.out.println(reverseString(str));
        // reverseStack(s);
        // printStack(s);

        int stocks[] = {100, 80, 60, 70, 60, 85, 100};
        int span[] = new int[stocks.length];
       // stackSpam(stocks, span);
    

    }   
}
