public class Ch1902 {

    public static int calSum(int n){
        if (n == 1) {
            return 1;
        }
        int fnm1 = calSum(n-1);
        int sum = n+fnm1;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(calSum(5));
    }
    
}
