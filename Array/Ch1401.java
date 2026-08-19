import java.util.*;

public class Ch1401 {
    public static void BubbleSort(int arr[]){
        //int swap = 0;
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                //swap++;
                }
            }
        }//System.out.println(swap);
    }


    public static void SelectionSort(int arr[]) {
        for(int i=0; i<arr.length-1; i++){
            int minpos = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minpos]>arr[j]){
                    minpos = j;
                }        
            }
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;

        }
    }

    public static void printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+"  ");
        }
    }
    
    public static void Insertion(int arr[]) {
        for(int i=1; i>arr.length-1; i++){
            int curr = i;
            int prev = i-1;
            while (prev>=0 && arr[prev] < arr[curr]) {
                
            }
        }
    }

   public static void BubbleSort4(int arr[]){
    for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        }


        public static void selection2(int arr[]){
    for(int i=0; i<arr.length-1; i++){
        int minidx = i;
            for(int j=i+1; j<arr.length; j++){
                if (arr[j]<arr[minidx]) {
                    minidx = j;
                }
            }
            int temp = arr[minidx];
            arr[minidx] = arr[i];
            arr[i] = temp;

            }

        }
    


    public static void Insertsort(int arr[]) {
        for(int i=1; i<arr.length-1; i++){
            int curr = i;
            int prev = i-1;
            while (curr <= 0 && arr[prev]>arr[curr]) {
                arr[prev+1] = arr[prev];
            }
            arr[prev+1] = arr[curr];
        }
    }




    public static void main(String[] args) {
        int nums[] = {5, 4, 1, 3, 2};
        //BubbleSort4(nums);
       //SelectionSort(nums);
       //Insertsort(nums);
       //selection2(nums);
       Arrays.sort(nums);
        printarr(nums);
    }
}

