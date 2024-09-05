public class SIDDLE_POINT {
    public static boolean saddlePoint(int a[][], int n) {
        for (int i = 0; i < n; i++) {
            int min_row = a[i][0];
            int col_index = 0;
            for (int j = 1; j < n; j++) {
                if (min_row > a[i][j]) {
                    min_row = a[i][j];
                    col_index = j;
                }
            }
            int k;
            for (k = 0; k < n; k++) {
                if (min_row < a[k][col_index]) {
                    break;
                }
            }
            if (k == n) {
                System.out.println("Saddle point = " + min_row);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int a[][] = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int n = 3;
        if (saddlePoint(a, n) == false) {
            System.out.println("No saddle point");
        }
    }
}
