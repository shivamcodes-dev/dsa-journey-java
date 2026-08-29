public class FirstAndLastele {
    public static int first = -1;
    public static int last = -1;

    public static void firstAndLastoccerInStr(String str, char key, int n) {
        if (n == str.length()) {
            return;
        }
        if (str.charAt(n) == key) {
            if (first == -1) {
                first = n;
            } else {
                last = n;
            }
        }
        firstAndLastoccerInStr(str, key, n + 1);

    }

    public static void main(String[] args) {
        firstAndLastoccerInStr("aZbscsZyeidbsachab", 'Z', 0);
        System.out.println(first + "and last = " + last);
    }
}
