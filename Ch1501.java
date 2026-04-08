public class Ch1501 {

   public static void SprialMatrix(int arr[][]) {
        
            int srow = 0;
            int endrow = arr.length-1;
            int scol = 0;
            int endcol = arr[0].length-1;
            while (srow <= endrow && scol <= endcol) {
                //top
                for (int j=scol; j<=endcol; j++) {
                    System.out.print(arr[srow][j]+" ");                    
                }
                //left
                 for (int i=srow+1; i<=endrow; i++) {
                    System.out.print(arr[i][endcol]+" ");
                 } 
                 //bottom
                  for (int j=endcol-1; j>=scol; j--) {
                    if(srow == endrow){
                        break;          //For 3*3 matrix.
                    }
                    System.out.print(arr[endrow][j]+" ");                    
                }
                //right
                 for (int i=endrow-1; i>=srow+1; i--) {
                    if(scol == endcol){
                        break;
                    }
                    System.out.print(arr[i][scol]+" ");
                 } 

                 srow++;
                 scol++;
                 endrow--;
                 endcol--;
            
        }
    }


    public static int DiagonalSum(int arr[][]){// O(n^2)
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(i == j){
                    sum += arr[i][j];
                }
                else if(i+j == arr.length-1){
                    sum += arr[i][j];
                }
            }
           
        }
         return sum;

    }

    
    public static int Opt_DiagonalSum(int arr[][]){//timecom = O(n)
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            //primarydiagonal
            sum+=arr[i][i];

            //Secondarydiagonal
            if(i != arr.length-i-1){
            sum+=arr[i][arr.length-i-1];
            }
        }
        return sum;
    }



    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 16}};
        int matrix2[][] = {{1, 2, 3},
                        {5, 6, 7},
                        {9, 10, 11}};


        // SprialMatrix(matrix2);
        System.out.println(Opt_DiagonalSum(matrix));
    }
    
}
