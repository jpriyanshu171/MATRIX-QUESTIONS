import java.util.Scanner;

public class SUBTRACTION {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows");
        int r = sc.nextInt();
        System.out.println("Enter the columns");
        int c = sc.nextInt();
        int a[][] = new int[r][c];
        System.out.println("Enter matrix 1 elements");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix 1 is");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter matrix 2 elements");
        int b[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix 2 is");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        int sub[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sub[i][j] = a[i][j] - b[i][j];
            }
        }
        System.out.println("The subtraction of matrices is");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(sub[i][j] + " ");
            }
            System.out.println();
        }
    }
}
