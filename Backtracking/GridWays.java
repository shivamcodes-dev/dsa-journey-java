package Backtracking;

class GridWays {

    public static int findGridWays(int m, int n, int r, int c) {

        if (r == m - 1 && c == n - 1) {
            return 1;
        } else if (r == m || c == n) { // boundary ke bahar najaye
            return 0;
        }

        int way1 = findGridWays(m, n, r + 1, c);
        int way2 = findGridWays(m, n, r, c + 1);

        return way1 + way2;
    }

    public static void main(String[] args) {
        System.out.println(findGridWays(3, 3, 0, 0));
    }

}