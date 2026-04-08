import java.util.Scanner;

class Ch1702 {
    public static void twoSum(int n) {
           for(int i=1; i<=n; i++){
        for(int j=1; j<=n-i; j++){
            System.out.print(" ");
        }
            for (int j2 = 1; j2 <= i; j2++) {
                System.out.print("#");
            
        }
        System.out.println();
    }



    }

public static void main(String[] args) {
// twoSum(6);
 Scanner scan = new Scanner(System.in);
 String s = scan.nextLine();
        int i = scan.nextInt();
        double d = scan.nextDouble();
        

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
}
}