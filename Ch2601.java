import java.util.ArrayList;

public class Ch2601 {
    public static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty(){
            return list.size() == 0;
        }

        //push
        public static void push(int data){
            list.add(data);
        }

        //pop
        public static int pop(){
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(top);
            return top;
        }

        //peek
        public static int peek(){
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size()-1);
        }
        public static void main(String[] args) {
            Stack s = new Stack();
            s.push(5);
            s.push(8);
        }
    
        
    }
    
}
