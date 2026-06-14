package Loops;
import java.util.Scanner;

public class Assi201 {
    public static void main(String[] args) {
        // : Write a program that reads a set of integers, and then prints the sum of the 
//even and odd integers. 
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter no. ");
        
        int num;
        int choise;
        int sumeven = 0;
        int sumodd = 0;

        do{
             num = sc.nextInt();
            if(num%2==0){
                sumeven += num;
            }
            else{
                sumodd += num;
            }
       
        
        System.out.println("Enter no 1/0. ");
        choise = sc.nextInt(); 
        }
        
        while(choise==1);
    }
    
}
