import java.util.Scanner;

public class Ch1002 {
    public static void main(String[] args) {
       /*  For a positive N , WAP that prints the first N Fibonacci numbers. 
(Assume N >= 2)  */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any no: ");
        int num = sc.nextInt();
        //int num = 10;

        int seclast = 0;
        int last = 1;
        System.out.print(seclast+" "+last+" ");
        for(int i=2; i<num; i++){
       // Fibonacci = last + selast;
       int Fibonacci =  seclast+last;
       System.out.print(Fibonacci+" ");
        
        seclast = last;
        last = Fibonacci;
        }
        System.out.println();



        int n=5;
        int first = 0;
        int second = 1;
        System.out.print(first+" "+ second+" ");
        for(int i=1; i<n; i++){
            int third = first+second;
            System.out.print(third+" ");
            first = second;
            second = third;
        }





    }
}
