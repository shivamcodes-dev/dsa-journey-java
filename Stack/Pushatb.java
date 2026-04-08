package Stack;

import java.util.Stack;

public class Pushatb {
    public static void pushAtBottm(Stack<Integer> s, int data) {
        if (s.empty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottm(s, data);
        s.push(top);

    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(2);
        s.push(13);
        s.push(33);
        s.push(23);
        s.push(43);
        s.push(23);
        s.push(39);

        pushAtBottm(s, 69);
        // System.out.println(s.peek());
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
