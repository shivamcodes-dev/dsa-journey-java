public class BestimeTosellStock {

    public static int BestimeToBuySellStock(int arr[]){
        
        int min = arr[0];
        int bestP = 0;
        for(int i=1; i<arr.length; i++){
            min = Math.min(min, arr[i]);
            int currP = arr[i] - min;
            bestP = Math.max(currP, bestP);
            System.out.println(min + " " + arr[i]);
        }
        return bestP;
    }
    public static void main(String[] args) {
        int num[] = {4, 3, 2, 1};
        System.out.println(BestimeToBuySellStock(num));
    }
}