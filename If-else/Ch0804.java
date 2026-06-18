import java.util.Scanner;

public class Ch0804 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter First No. ");
        int a = sc.nextInt();
        System.out.println("Enter Second No. ");
        int b = sc.nextInt();
        System.out.println("Enter Third No. ");
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println("Largest is " + a);
        }
        else if(b>c && b>a){
            System.out.println("Largest is " + b);
        }
        else{
            System.out.println("Largest is " + c);
        }


    }
}
