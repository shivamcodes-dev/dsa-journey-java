public class Ch1103 {


    //binareytodecimial
      public static void Bintodec(int n){
        
        int pow = 0;
        int dec = 0;
        while(n>0){
            int lastdig = n%10;
            dec =dec+ (lastdig*(int)Math.pow(2, pow));
            pow++;
            n = n/10;
        }
       System.out.println(dec);
    }


    //dectobin
    public static void dectobin(int n){
            int bin = 0;
            int pow = 0;
        while (n>0) {
            int rem = n%2;
            bin += rem * ((int)Math.pow(10, pow));
            n = n/2;
            pow++;
            
        }
        System.out.println(bin);
    }



    public static void main(String[] args) {
    //Bintodec(101);
    dectobin(5);
}
    
}
