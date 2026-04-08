public class Ch1901 {

    // n to 1
    public static void decOrd(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }

        System.out.print(n + " ");
        decOrd(n-1);
    }

    // 1 to n
    public static void incOrd(int n){
        if(n==1){
            System.out.print(n + " ");
            return;
        }
        incOrd(n-1);
        System.out.print(n + " ");
    }
    
        //fabonachi secrice
    public static int fact(int n){
        if (n == 0) {
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn = fnm1 * n;
        return fn;
    }

    //sum of n natural 
    public static int sumofNnum(int n){
        if(n==1){
            return 1;
        }
        int sumnm1 = sumofNnum(n-1);
        int sum = n + sumnm1;
        return sum;
    }

    //fabonachi

    public static int fab(int n){
        if(n==0 || n==1){
            return n;
        }
        

        int fnm1 = fab(n-1);
        int fnm2 = fab(n-2);
        int fabonachi = fnm2 + fnm1;
        return fabonachi;
    }


    //Serch for Sorted or not
    public static boolean isSorted(int arr[], int i){
        if (i==arr.length-1) {
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
        
    }

    //First occuerence on array at given key
    public static int firstOccuerence(int arr[], int i, int key){
        if (i==arr.length-1) {
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccuerence(arr, i+1, key);
    }


    public static int lastOccuerence(int arr[], int i, int key){
        if (i==0) {
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return lastOccuerence(arr, i-1, key);
    }    

        // x^n
    public static int printXpown(int x, int n){
        if(n == 0){
            return 1;
        }
        // int xnm1 = printXpown(x, n-1);
        // int ans = x*xnm1;
        // return ans;
        return x*printXpown(x, n-1); 
    }

    //optimize x^n
    public static int optPower(int x, int n){
        if(n == 0){
            return 1;
        }
        int halfpower = optPower(x, n/2);
        int halfpowersq = halfpower*halfpower;
        if(n%2 != 0){
            return x * halfpower *halfpower;
        }
        return halfpowersq;
    }

    // tailing prob
    public static int tailprob(int n){
        if (n == 0 || n==1) {
            return 1;
        }

        //kaam
        //vertical
        int fnm1 = tailprob(n-1);

        //horigental
        int fnm2 = tailprob(n-2);
        return fnm1+fnm2;
    }

    public static void removrDuplicate(String str, int idx, StringBuilder newstr, boolean map[]){
        if (idx == str.length()) {
            System.out.println(newstr);
            return;
        }

        char ch = str.charAt(idx);
        if(map[ch-'a'] == true){
            removrDuplicate(str, idx+1, newstr, map);
        }else{
            map[ch - 'a'] = true;
            removrDuplicate(str, idx+1, newstr.append(ch), map);
        }
    }



    public static int firendPairProb(int n){
        if(n==1){
            return 1;
        }
        if (n==2) {
            return 2;
        }

        //single
        int fnm1 = firendPairProb(n-1);

        //pair
        int fnm2 = (n-1) * firendPairProb(n-2);
        int totalway = fnm1+fnm2;
        return totalway;
    }



    public static void binaryString(int n, int lastplace, String str){
        if (n==0) {
            System.out.println(str);
            return;
        }

        if(lastplace != 1){
            // nth place 0
            binaryString(n-1, 0, str+"0");
            //nth place 1
            binaryString(n-1, 1, str+"1");
        } else{
            binaryString(n-1, 0, str+"0");
        }
    }

    




    public static void main(String[] args) {
        int num = 5;
        // decOrd(num);
        // incOrd(num);
        // System.out.println(fact(num));
        // System.out.println(sumofNnum(num));
        // System.out.println(fab(num));
         int arr[] = {1, 5, 2, 4, 5, 6};
        // System.out.println(isSorted(arr, 0));
        // System.out.println(firstOccuerence(arr, 0, 15));
        // 
        // System.out.println(printXpown(2, 2));
        // System.out.println(optPower(2, 5));
        // System.out.println(tailprob(10));
        // String s = "harharmahadev";
        // removrDuplicate(s, 0, new StringBuilder(""), new boolean[26]);
        // System.out.println(s);

        // System.out.println(firendPairProb(4));
        binaryString(3, 0, "");


    }
    
}
