public class Assi301 {

    public static boolean twise(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }


    public static int stockPrice(int price[]){
        for(int i=0; i<price.length; i++){
            //max left

            //max right

        }return 1;
    }
 
    

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 1};
        System.out.println(twise(nums)); 
    }
}
