public class Subarray {
    public static void Subarray(int num[]){
        int totalsub = 0;
        // int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++){
            for(int j=i; j<num.length; j++){
                int subSum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(num[k] + ", ");
                    subSum+=num[k];
                    maxSum = Math.max(maxSum, subSum);
                }
                totalsub++;
                System.out.println("sum => " + subSum);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(maxSum);
    }

    //kadan

    public static void Kadan(int num[]){
        int totalsub = 0;
        // int currSum = 0;
        int maxSum = 0;
        int currSum = 0;
        for(int i=0; i<num.length; i++){
            currSum+=num[i];
            if(currSum<0){
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        int arr[] = {1, -2, 6, -1, 3};
        Subarray(arr);
    }
}
