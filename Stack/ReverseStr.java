package Stack;

import java.util.Stack;

public class ReverseStr {
    public static void main(String[] args) {
        String str = "JaiShriRam";
        Stack<Character> s = new Stack<>();
        int i = 0;
        while (i < str.length()) {
            s.push(str.charAt(i));
            i++;
        }
        String ans = "";
        while (!s.empty()) {
            ans += s.peek();
            s.pop();
        }
        System.out.println(ans);

    }
}
