package Loops;
import java.util.Scanner;

public class Assi203 {
    public static void main(String[] args) {
        //Write a program to print the multiplication table of a number N, entered by the 
//user.
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. ");
        int n = sc.nextInt();
        int table = 1;

        for(int i=1; i<=10; i++){
            table =n * i;
            System.out.println(i +" * "+ n + "="+ table);
        }




         /*  For a positive N , WAP that prints all the prime numbers from 2 to N. 
(Assume N >= 2) */

       // Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.");
        int no = sc.nextInt();
        for(int i=2; i<no; i++){
            if(n%i==0){
                System.out.println(n+" is div by"+i);
            }
        }



    }
    
}
