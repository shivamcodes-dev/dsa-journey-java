import java.util.Arrays;
import java.util.Stack;

public class Ch2603 {
    public static void pushAtBottom(Stack<Integer> s, int data){
        if (s.empty()) {
            s.push(data);
            return ;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while (idx<str.length()) {
         char ch = str.charAt(idx);
         s.push(ch);
         idx++;   
        }
        StringBuilder ans = new StringBuilder("");
        while (!s.isEmpty()) {
            char curr = s.pop();
            ans.append(curr);
        }

        return ans.toString();
    }


    public static void reverseStack(Stack<Integer> stack){

        if (stack.isEmpty()) {
            return;
        }

        int top = stack.pop();
        reverseStack(stack);
        pushAtBottom(stack, top);
    }

    public static void print(Stack<Integer> stack){
        while (!stack.isEmpty()) {
            int top = stack.pop();
            System.out.println(top);
        }
    }

    public static int[] spamStock(int stock[], int spam[]){
        Stack <Integer> s = new Stack<>();
        spam[0] = 1;
        s.push(0);
        for(int i=1; i<stock.length; i++){
            int currPrice = stock[i];
            while (!s.isEmpty() && currPrice>stock[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                spam[i] = i+1;
            }else{
                spam[i] = i-s.peek();
            }
            s.push(i);
        }
        
        return spam;
    }

    public static void nextGreaterEle(int[] arr, int[] nextGreater){

        Stack <Integer> s = new Stack<>();
        for (int i=arr.length-1; i>=0; i--) {
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nextGreater[i] = -1;
            }else{
                nextGreater[i] = arr[s.peek()];
            }
            s.push(i);
        }
    }

    public static boolean isValidPranthes(String str){
        Stack <Character> s = new Stack<>();
        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
          if (ch == '(' || ch == '{' || ch == '[') { //opening
            s.push(ch);
          }else {//else for closing
                if (s.isEmpty()) { //")))))))" matlab koi bhi opening pranthrs hai hi nahi
                    return false;
                }
                if ((s.peek() == '(' && ch == ')') 
                    || (s.peek() == '{' && ch == '}')
                    || (s.peek() == '[' && ch == ']')) {
                         s.pop();
                 } else {
                    return false;
                }
             }
        }

        //This is for abhi bhi bachhe hai ya nahi pranthes
        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isDuplicate_Pranthes(String str){
        Stack <Character> s = new Stack<>();
        for (int i=0; i < str.length(); i++) {
            char ch = str.charAt(i);

        }
        return true;
    }
    public static void main(String[] args) {
        Stack<Integer> s =  new Stack<>();
        s.push(1); 
        s.push(2);
        s.push(3);

        // System.out.println(reverseString("abcd"));
        // // print(s);
        // reverseStack(s);
        // print(s);
        // int stock[] = {100, 80, 60, 70, 60, 85, 100};
        // int span[] = new int[stock.length];
        // spamStock(stock, span);
        // System.out.println(Arrays.toString(span));

        // int arr[] = {6, 8, 0, 1, 3};
        // int nextGreater[] = new int[arr.length];
        // nextGreaterEle(arr, nextGreater);
        // System.out.println(Arrays.toString(nextGreater));
        String pranthes = "((){[]})";
        System.out.println(isValidPranthes(pranthes));
    }
    
}
