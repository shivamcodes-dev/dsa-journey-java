public class Ch1701 {

    public static void oddOrEven(int n){
        int Bitmask = 1;
        if((n & Bitmask) == 0){
            System.out.println("It's Even:)");
        }else{
            System.out.println("It's Odd:)");
        }
    }


    public static int getIthBit(int n, int i){
        int Bitmask = 1<<i;
        if((n & Bitmask) == 0){
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        // oddOrEven(88);
        // oddOrEven(99);
        System.out.println(getIthBit(10, 3));
    }
    
}
