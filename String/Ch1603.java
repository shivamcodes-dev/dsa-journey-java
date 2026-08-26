public class Ch1603 {

    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");

        char ch =Character.toUpperCase(str.charAt(0));
            sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }            
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        // StringBuilder sr = new StringBuilder();
        // for(char ch='a'; ch<='z'; ch++){
        //     sr.append(ch);
        // }
        // System.out.println(sr);

        String word = "hii i am Shivam rajput";
        System.out.println(toUpperCase(word));
    }
    
}
