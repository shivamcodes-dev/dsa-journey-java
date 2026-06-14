package Loops;
import java.util.Scanner;

public class Ch0903 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter any no. ");
        int n = sc.nextInt();

        boolean isprime =true;


        if(n==2){
            System.out.println("it is prime");
        }else{
        for(int i=2; i<n; i++){
            if(n%i==0){
                isprime = false;
                // break;   
            }
        }

            if(isprime==false){
                System.out.println("It is not a prime number.");
            }
            else{
                System.out.println("it is a prime number");
            }
        }
    }
        
        
    }


