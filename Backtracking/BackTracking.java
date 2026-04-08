package Backtracking;

public class BackTracking {
    public static void changArray(int arr[], int i, int value) {
        if (i == arr.length) {
            return;
        }

        arr[i] = value;
        changArray(arr, i + 1, value + 1);
        arr[i] = arr[i] - 2;

    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void subSetString(String str, String ans, int i) {
        if (i == str.length()) {
            System.out.println(ans);
            return;
        }

        subSetString(str, ans + str.charAt(i), i + 1);
        subSetString(str, ans, i + 1);

    }


    static int count = 0;

    public static void main(String[] args) {
        // int arr[] = new int[5];
        // changArray(arr, 0, 1);
        // print(arr);
        // subSetString("abc", "", 0);
        // findPermitation("abc", "");

    }
}
