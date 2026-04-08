public class CompressString {
    public static String compresString(String str){
        StringBuilder sr = new StringBuilder("");
        for(int i=0; i<str.length(); i++){
            // sr.append(str.charAt(i));
            Integer count = 1;
            while (i < str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }
            sr.append(str.charAt(i));
            if(count>1){
                sr.append(count);
            }
        }


        return sr.toString();
    }
    public static void main(String[] args) {
        String word = "aaaASabcccddss";
        System.out.println(compresString(word));
        System.out.println(word.toLowerCase());
    }
    
}
