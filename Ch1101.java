import java.util.Scanner;

public class Ch1101 {

    public static void printhello(){
        System.out.println("hello duniya");
        System.out.println("hello duniya");
        //return ;
    }

    // public static int sum(int a,int b){
    //     int sum1 = a+b;
    //     //System.out.println(sum);
    //     return sum1;
    // }


    public static int product(int a, int b){
        int prod = a*b;

        return prod;
    }


    public static int factorial(int n){
        int fact = 1;
        for(int i=n; i>0; i--){
            fact *= i;
        }
        return fact;
    }


    public static int binomial(int n, int r){
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial(n-r);
        int bino = n_fact / (r_fact * nmr_fact);

        return bino;
    }

    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a, int b,int c){
        return a+b+c;
    }
    public static float sum(float a, float b){
        return a+b;
    }




    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int num1 = sc.nextInt();
        // int num2 = sc.nextInt();

        //     printhello();
    
    //    int sum2 = sum(5,7);
    //     System.out.println(sum2);

        // int pro = product(num1, num2);
        // System.out.println("Product= "+ pro);

        //int factorial = 1;
        //System.out.println(factorial(5));

    //    System.out.println(binomial(num1, num2)); 

    System.out.println(sum(10, 2));
        System.out.println(sum(10, 2,5));
        System.out.println(sum(1.2f, 2.5f));

    }
}
