import java.util.Scanner;

public class Assi101 {
    public static void main(String args[]) {
        // Write a Java program to get a number from the user and print whether it is
        // positive or negative.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no.(+,-): ");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("You entered positive.");
        } else {
            System.out.println("You entered negative.");
        }
    }

}
