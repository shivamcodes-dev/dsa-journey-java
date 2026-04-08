public class BitWise {
    public static void oddorEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.print("even");
        }else{
            System.out.println("odd");
        }
    }

    public static void getIthBit(int n, int i){
        int bitMask = (1<<i);
        if((n & bitMask) == 0){
            System.out.println("ith Bit is 0");
        }else{
            System.out.println("ith bit is 1");
        }
    }

    public static int setIthBit(int n, int i){
        int bitMask = 1<<i;
        return (n|bitMask);
    }

    public static int clearIthBit(int n, int i){
        int bitMask = ~(1<<i);
        return( n & bitMask);
    }

    public static int updateItbit(int n, int i, int newkey){
        n = clearIthBit(n, i);
        int bitMask = newkey<<i;
        return n | bitMask;
    }

    public static int clearLastIthBit(int n, int i){
        int bitMask = (~0) << i;
        return n&bitMask;
    }
    public static int clearItoJBit(int n, int i, int j){
        int babyBitMask = (~0)<<(j+1);
        int babyBitMask2 = (1<<i)-1;   // babymask2 ko 2 ka power(j-1) kar ke -1 kar do; 2^(j-1) esliye kyu j ke baad se 11111 hi lana hai aur esko lane ke liye bitMask me lac 16
        int bitMask = babyBitMask | babyBitMask2;
        return n & bitMask;
    }

    public static boolean isnPowOfTwo(int n){
        int bitMask = n-1;
        return (n & bitMask) == 0;
    }

    public static int countBits(int n){
        int count = 0;
        while (n>0) {
            if((n & 1) != 0){
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        // System.out.println(5<<3); // 001 101
        // oddorEven(3);
        // getIthBit(10, 3);
        // System.out.println(setIthBit(10, 3));
        // System.out.println(clearIthBit(10, 3));
        // System.out.println(updateItbit(10, 1, 1));
        // System.out.println(clearLastIthBit(15, 2));
        // System.out.println(clearItoJBit(31, 1, 3)); 
        // System.out.println(isnPowOfTwo(8));
        System.out.println(countBits(7));
    }
}
