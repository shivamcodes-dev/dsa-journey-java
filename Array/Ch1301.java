

public class Ch1301 {

    public static int Canteen(String manu[], String dish){
        for(int i=0; i<manu.length; i++){
            if(manu[i]==dish){
                return i;
            }
        }
        return -1;
    }


    public static int getlargest(int num[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<num.length; i++){
            if(num[i]>largest){
                largest = num[i];
            }
            if(num[i]<smallest){
                smallest = num[i];
            }
        }System.out.println("Smallest is "+ smallest);
        return largest;
        
    }


    public static void main(String[] args) {
        // String menu[] = {"Samosa", "Dosa", "maggi", "Chole Bhathure", "Aalu paratha", "frooti",};
        // int idx = Canteen(menu, "dosa");
        // System.out.println(idx);

        int arr[] = {1, 2, 46, 3, -85+5};
        System.out.println(arr);
        
        // int lar = getlargest(arr);
        // System.out.println("largest is "+ lar);
       
        }
    
}
