public class Ch2201 {

    public static void findSubset(String s, int i, StringBuilder ans){

        if (i == s.length()) {
            System.out.println(ans + "   ;");
            return;
        }
        //yes
        findSubset(s, i+1, ans.append(s));
        //no
        findSubset(s, i+1, ans);
    }


    public static void printParmination(String str, String ans){
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String Newstr = str.substring(0, i) + str.substring(i+1, str.length());
            printParmination(Newstr, ans+curr);
        }

        
    }
    public static void main(String[] args) {
        String str = "abc";
        // findSubset(str, 0, new String(""));
        // System.out.println("rt");
        printParmination(str, "");
    }
    
}
