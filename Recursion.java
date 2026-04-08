public class Recursion {

    public static void printNumnToone(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }

        System.out.println(n);
        printNumnToone(n - 1);
    }

    public static void printNumoneTn(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        printNumnToone(n - 1);
        System.out.println(n);
    }

    public static int factroil(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factroil(n - 1);
    }

    public static int sumOfN(int n) {
        if (n == 0) {
            return n;
        }
        return n + sumOfN(n - 1);
    }

    public static int printNthFabNum(int n) {

        if (n == 1 || n == 0) {
            return n;
        }
        return printNthFabNum(n - 1) + printNthFabNum(n - 2);

    }

    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }

        if (arr[i] > arr[i + 1]) {
            return false;
        }

        return isSorted(arr, i + 1);
    }

    public static int firstOccer(int arr[], int key, int i) {

        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccer(arr, key, i + 1);
    }

    public static int lastOccer(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccer(arr, key, i + 1);

        if (isFound != -1) {
            return isFound;
        }
        if (arr[i] == key) {
            return i;
        }
        return -1;// ya return isfound;
    }

    public static int lastOccer2(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccer(arr, key, i + 1);

        if (isFound == -1 && arr[i] == key) {
            return i;
        }

        return isFound;// ya return isfound;
    }

    public static int powXofn(int x, int n) {
        if (n == 1) {
            return x;
        }
        return x * powXofn(x, n - 1);
    }

    public static int optmizePowOfXofN(int x, int n) {
        if (n == 0) {
            return 1;
        }

        int halfPow = optmizePowOfXofN(x, n / 2);
        int sqhalfPow = halfPow * halfPow;

        if (n % 2 != 0) {
            sqhalfPow *= x;
        }
        return sqhalfPow;
    }

    public static int tilingProb(int n) {
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }

        // kaam
        // vertical choise
        int vertical = tilingProb(n - 1);

        // horigentel choise
        int horigentel = tilingProb(n - 2);

        return vertical + horigentel;
    }

    public static void removeDuplicate(String str, int idx, StringBuilder newStr, boolean map[]) {
        // base case
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        // kaam
        char ch = str.charAt(idx);
        if (map[ch - 'a'] == false) {
            newStr.append(ch);
            map[ch - 'a'] = true;
        }
        removeDuplicate(str, idx + 1, newStr, map);

    }

    public static int friendsPairingProb(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        return friendsPairingProb(n - 1) + friendsPairingProb(n - 2);
    }

    public static void main(String[] args) {
        // System.out.println(factroil(3));
        // printNumnToone(10);
        // System.out.println(sumOfN(5));
        // System.out.println(printNthFabNum(5));
        int array[] = { 8, 3, 6, 9, 5, 3, 10, 2, 5, 3 };
        // System.out.println(isSorted(array, 0));
        // System.out.println(firstOccer(array, 14, 0));
        // System.out.println(lastOccer(array, 5, 0));
        // System.out.println(lastOccer2(array, 5, 0));
        // System.out.println(powXofn(2, 10));
        // System.out.println(optmizePowOfXofN(2, 05));
        // System.out.println(tilingProb(4));
        String s = "appnnacollage";
        StringBuilder sb = new StringBuilder();
        boolean arr[] = new boolean[26];
        // removeDuplicate(s, 0, sb, arr);
        System.out.println(friendsPairingProb(4));

    }

}
