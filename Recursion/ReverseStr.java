public class ReverseStr {
    public static void printReverse(String str, int n) {
        if (n == str.length()) {
            return;
        }

        printReverse(str, n + 1);
        System.out.print(str.charAt(n) + " ");
    }

    public static void printReverse2(String str, int n) {
        if (n == 0) {
            System.out.print(str.charAt(n) + " ");
            return;
        }

        System.out.print(str.charAt(n) + " ");
        printReverse2(str, n - 1);
    }

    public static void main(String[] args) {
        String str = "abbdaes";
        printReverse2(str, str.length() - 1);
    }
}
