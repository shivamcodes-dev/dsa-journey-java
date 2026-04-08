import java.util.ArrayList;

public class Ch2307 {

    public static int Waterfole(ArrayList<Integer> height){
        int maxWater = Integer.MIN_VALUE;

        for (int i=0; i<height.size(); i++) {
            for (int j=i+1; j<height.size(); j++) {

                
                int width = j-i;
                int hit = Math.min(height.get(i), height.get(j));
                int currwater = width*hit;
                maxWater = Math.max(maxWater, currwater);
                
            }
            
        }
        return maxWater;
    }

    public static int optWaterfole(ArrayList<Integer> height){
        int lp = 0;
        int rp = height.size()-1;
        int maxWater = 0;
        
        //Area
        while (lp<rp) {
            int width = rp-lp;
            int heigh = Math.min(height.get(lp), height.get(rp));
            int currwater = heigh * width;
            maxWater = Math.max(maxWater, currwater);

            if (height.get(lp)<height.get(rp)) {
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
    }

    // Pair Sum

    public static boolean pairSum(ArrayList<Integer> num, int target){
        int lp = 0;
        int rp = num.size()-1;
        
        
        while (lp!=rp) {
            int sum = num.get(lp) + num.get(rp);
           if (sum == target) {
            return true;
           }
           
           if(sum<target){
            lp++;
           }else{
            rp--;
           }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(2);
        height.add(3);
        height.add(4);
        height.add(5);
        height.add(6);
        height.add(7);
        height.add(8);
        height.add(9);
        System.out.println();
    
        System.out.println(pairSum(height,50));
    }

    
}
