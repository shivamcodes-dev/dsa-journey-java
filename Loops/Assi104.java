public class Assi104 {
    public static boolean twoSum(int x) {
        boolean ispali = true;
        int rev = 0;
        int copy = x;
        while(x>0){
            int lastdig = x%10;//789
            rev = rev*10 + lastdig;
            x /= 10;
            System.out.println(rev);
        }System.out.println(rev);
        if(rev == copy){
            ispali = true;
        }else{
            ispali = false;
        }
        return ispali;
    }



public static void main(String[] args) {
    System.out.println(twoSum(121));;
}
}

