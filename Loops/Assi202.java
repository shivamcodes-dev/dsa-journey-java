import java.util.Scanner;

public class Assi202 {
    public static void main(String[] args) {
        /// Write a program to find the factorial of any number entered by the user.
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no.");
        int n=sc.nextInt();
        int factorial = 1;
        for(int i=n; i>0; i--){
            factorial *=  i;
            System.out.println(factorial);
        }
        System.out.println(factorial);
   
   
    }
}
