import java.util.*;

public class Ch1102 { //prime

    public static boolean isprime(int n){
        if(n==2){
            return true;
        }
        for (int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

        // int num = 3;
    public static void prime(int n){
        for(int i=2; i<=n; i++){
           if(isprime(i)==true){
            System.out.print("  "+ i);
           }
        }
    
    }


    public static void Bintodec(int n){
        int dec = 0;
        int pow = 0;
        do{
            int lastdig = n%10;
            dec += lastdig*Math.pow(2, pow);
            pow++;
            n = n/10;
        }while(n>0);
       System.out.println(dec);
    }


    public static void main(String[] args) {
      //prime(23);
      Bintodec(111);
    }
    
}
