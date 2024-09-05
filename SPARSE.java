// A matrix is a collection of data elements arranged in a two-dimensional array-like structure, consisting of rows and columns. A matrix with a lot of zero values is called a sparse matrix.
import java.util.Scanner;
public class SPARSE {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows");
        int r=sc.nextInt();
        System.out.println("Enter the columns");
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        System.out.println("Enter matrix elements");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("The matrix is");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        int n = r * c;
        int count = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (a[i][j] == 0) {
                    count++;
                }
            }
        }
        if (count > (n / 2)) {
            System.out.println("Given matrix is sparse matrix");
        } else {
            System.out.println("Given matrix is not a sparse matrix");
        }
    }
}
/*
Time Complexity:

* O(m*n)  where m is no of rows and n is no of columns in matrix
Auxiliary Space: O(1)
Space complexity:

* Space complexity of this code is O(1) because the space used by the program is constant, regardless of the input size. The program only uses a fixed amount of space to declare and initialize variables and arrays, and does not create any new objects or data structures that grow in size with the input. Therefore, the space used by the program remains constant, and the space complexity is O(1).
 */