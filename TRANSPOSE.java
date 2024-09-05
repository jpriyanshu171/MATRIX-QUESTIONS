public class TRANSPOSE {
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int r=a.length;
        int c=a[0].length;
        System.out.println("Given matrix is");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        int t[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                t[i][j]=a[j][i];
            }
        }
        System.out.println("Transpose of matrix is");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(t[i][j]+" ");
            }
            System.out.println();
        }
    }
}
