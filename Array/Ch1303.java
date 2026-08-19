public class Ch1303 {

    public static void swap(int num[]){
        int first=0, last=num.length-1;
        while (first<last) {
            int temp = num[last];
            num[last] = num[first];
            num[first] = temp;
            first++;
            last--;
        }
    }

    public static void printarry(int arry[]){
        for(int i=0; i<arry.length; i++){
            System.out.print(arry[i]+" ");
        }
    }

    public static void Pairsarray(int num[]){
        int totalpair = 0;
        for(int i=0; i<num.length; i++){
            //int a = num[i];
            for(int j=i+1; j<num.length; j++){
                System.out.print("("+num[i]+" "+ num[j]+") ");
                totalpair++;
            }
            System.out.println();
        }
        System.out.println("Totel of the pairs = "+totalpair);
    }

    public static void SubArray(int num[]){
        for(int i=0; i<num.length; i++){
            for(int j=i; j<num.length; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(num[k]+" ");
                }System.out.println();
            }System.out.println();
        }
    }


     public static void SubArraySum(int num[]){
        int sum = 0;
        for(int i=0; i<num.length; i++){
            
            for(int j=i; j<num.length; j++){
                sum = 0;
                for(int k=i; k<=j; k++){    
                    sum+=num[k];
                    System.out.print(num[k]+" ");
                }System.out.println("->"+sum);
                // sum = 0;
            }System.out.println();
        }
    }

    public static void MaxSubarraySum(int num[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++){
            for(int j=i; j<num.length; j++){
                currsum=0;
                for(int k=i; k<=j; k++){
                    currsum+=num[k];
                    //subarry sum
                    System.out.print(currsum+"  ");
                }
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }
        }System.out.println("Maxsum = " + maxsum);
    }


    public static void MaxSubarraySumPrifix(int num[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        int prefix[] = new int[num.length];

        prefix[0]=num[0];
        //Calculate prefix array
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + num[i];
        }


        for(int i=0; i<num.length; i++){
            int st = i;                           //for understood
            for(int j=i; j<num.length; j++){
                int end = j;                        //for understood
                //currsum=0;  not use          
                currsum = st==0 ? prefix[end] : prefix[end] - prefix[st-1] ;
                System.out.println(currsum+"   ");
                }
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }
        System.out.println("Maxsum = " + maxsum);
    }


    //  2, -3, 4, -1, -2, 1, 5, -3
    public static void MaxSubarraySum_Kadan(int num[]){
        int currsum = 0, maxsum = Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++){
            currsum += num[i];
            if(currsum<0){
                currsum = 0;
            }
          maxsum =  Math.max(maxsum, currsum);
            
        }

        System.out.println("Max sum = "+maxsum);
    }


    public static void neg(int num[]){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++){
            if(num[i]<0){
                 max = Math.max(num[i], max);
            }
        }System.out.println(max);
    }


    public static int TrappedWater(int height[]){
        int n = height.length;
        int trapping[] = new int[height.length];
        int TrappedWater = 0;
        //Calculate left max boundary
        int leftmax[] = new int[height.length];
        leftmax[0] = height[0];
        for(int i=1; i<n; i++){
            leftmax[i] = Math.max(leftmax[i-1], height[i]);
        }
        
        //Calculate right max boundary
        int rightmax[] = new int[height.length];
        rightmax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightmax[i] = Math.max(rightmax[i+1], height[i]);
     
        }
        for(int i=0; i<n; i++){
             TrappedWater += Math.min(rightmax[i], leftmax[i])-height[i];
        }
    return TrappedWater; 
    }


    public static int stockPrice(int price[]){
        int profit = 0;
        int sell[] = new int[price.length] ;
       int minbuy = price[0];
        for(int i=1; i<price.length; i++){
          minbuy = Math.min(minbuy, price[i]);
          sell[i] = price[i] - minbuy;
          profit = Math.max(sell[i], sell[i-1]);       
        }
        return profit;
    }

    public static int buySellStockPrice(int price[]){  //optimize
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0; 

        for(int i=0; i<price.length; i++){
            if(buyPrice < price[i]){
                int profit = price[i] - buyPrice;
                maxProfit = Math.max(profit, maxProfit);
            }else{
                buyPrice = price[i];
            }
            
        }
         return maxProfit;
    }


    public static void main(String[] args) {
        int arry[] = {2, -3, 4, -1, -2, 1, 5, -3};
        int arry2[] = {1, 2, 3, 4, 8, 9, 10};
        //Pairsarray(arry);
        //SubArray(arry);
    //    SubArraySum(arry); 
    //    MaxSubarraySum(arry);
    //MaxSubarraySumPrifix(arry);
       // MaxSubarraySum_Kadan(arry);
// neg(arry2);
// System.out.println(stockPrice(arry2));
// System.out.println(buySellStockPrice(arry2));
    }   
}
