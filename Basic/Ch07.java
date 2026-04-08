import java.util.Scanner;

public class Ch07 {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter First no. ");
        int a = sc.nextInt();
        System.out.print("Enter Second no. ");
        int b = sc.nextInt();

        if(a > b){
            System.out.println("Largest is " + a);
        }
        else{
            System.out.println("Largest is " + b);
        }
    }
}
