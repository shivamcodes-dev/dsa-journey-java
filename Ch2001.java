import java.util.Arrays;

public class Ch2001 {

    // mearge the element 
    public static void merge(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei-si+1];//
        int i = si; 
        int j = mid+1;
        int k = 0 ;

        while (i<=mid && j<=ei) {
        if(arr[i]>arr[j]){
           temp[k] = arr[j];
            j++;
        }else{
           temp[k] = arr[i];
            i++;
        }
        k++;
    }
        // left
    while (i<=mid) {
        temp[k++] = arr[i++];
    }
        //right
    while (j<=ei) {
        temp[k++] = arr[j++];
    }
    // deep copy
    for (k=0, i=si; k<temp.length; k++, i++) {
        arr[i] = temp[k];
        }
    }

    //merge sort
    public static void mergSort(int arr[], int si, int ei){
        if (si>=ei) {
            return;
        }
        
        int mid = si+(ei-si)/2;
        mergSort(arr, si, mid);
        mergSort(arr, mid+1, ei);
        merge(arr, si, mid, ei);
        
    }
    public static void main(String[] args) {
        int arr[] = {1, 5, 2, 4, 5, 6, -8};
        mergSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    
}
