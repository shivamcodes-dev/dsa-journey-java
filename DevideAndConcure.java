public class DevideAndConcure {

    public static void mergeSort(int []arr, int st, int ei){

        if(st >= ei){
            return;
        }

        int mid = st + (ei-st)/2;
        mergeSort(arr, st, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr, st, mid, ei);
    }

    public static void merge(int arr[], int st, int mid, int ei){
        int i = st;
    }
    public static void main(String[] args) {
        
    }
}