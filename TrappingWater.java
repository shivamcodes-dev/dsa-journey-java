public class TrappingWater {

    public static int trappedRainWater(int arr[]){
        int leftMax[] = new int[arr.length];
        int rightMax[] = new int[arr.length];
        int n = arr.length;
        int trappWater = 0;

        //left max boundry
        leftMax[0]=arr[0];
        for (int i = 1; i < arr.length; i++) {
            leftMax[i] = Math.max(arr[i], leftMax[i-1]);
        }

        // right max Boundry

        rightMax[n-1] = arr[n-1];
        for (int i=n-2; i>=0; i--) {
            rightMax[i] = Math.max(arr[i], rightMax[i+1]);
        }
        
        //calculating water
        for(int i=0; i<n; i++){
            int water = Math.min(rightMax[i], leftMax[i]);
            trappWater += water - arr[i];
        } 

       return trappWater;
    }
    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trappedRainWater(height));;
    }
    
}
