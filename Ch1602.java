public class Ch1602 {
    public static void main(String[] args) {
        // String str = "Aam";
        // String str2 = "Mango";
        // System.out.println(str.compareTo(str2));

        String fruit[] = {"Mango", "Banana", "Apple", "Orange"};
            String large = fruit[0];
        for (int i=1; i<fruit.length; i++) {
            if (large.compareTo(fruit[i]) > 0) {
                large = fruit[i]; 
            }
        }
        System.out.println(large);
        
    }
    
}
