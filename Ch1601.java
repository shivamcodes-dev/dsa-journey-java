public class Ch1601 {

    public static boolean IsPalidram(String str){
        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                return false;
            }
            
        }
        return true;
    }


    public static float Sortestpath(String str){
        int x = 0, y = 0;
        for(int i=0; i<str.length(); i++){
            char dir = str.charAt(i);
            //north
            if(dir == 'n'){
                y++;
            }else if(dir == 's'){
                y--;
            }else if(dir == 'e'){
                x++;
            }else{
                x--;
            }
         
        }
         int X2 = x*x;
         int y2 = y*y;
         return (float)Math.sqrt(X2 + y2);
    }


    public static String SubString(String str, int sti, int endi){
        String subString = "";
        for(int i=sti; i<endi; i++){
            subString += str.charAt(i);
        }
        return subString;
    }


    public static void main(String[] args) {
        // String palidrom = "racecr";
        // System.out.println(IsPalidram(palidrom));
        // String Path = "wneenesennn";
        // System.out.println(Sortestpath(Path));
    //     String str = "ShivamRajput";
    //     // System.out.println(SubString(str, 6, 12));
    // //    System.out.println( str.substring(0, 6));
    //     String str2 = "Mango";
    //     System.out.println(str.compareTo(str2));
    char ch = 'i';
    
    System.out.println(Character.toUpperCase(ch));
    }
}
