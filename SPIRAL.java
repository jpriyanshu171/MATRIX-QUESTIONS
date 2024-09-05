public class SPIRAL {
    public static void spiralMatrix(int a[][],int m,int n){
        /*
        k--->starting row index
        l--->starting column index
        m--->ending row index
        n--->ending column index
         */
        int k=0;
        int l=0;
        while(k<m &&l<n){
            for(int i=l;i<m;i++){
                System.out.print(a[k][i]+" ");
            }
            k++;
            for(int i=k;i<n;i++){
                System.out.print(a[i][n-1]+" ");
            }
            n--;
            if(k<m){
                for(int i=n-1;i>=l;i--){
                    System.out.print(a[m-1][i]+" ");
                }
                m--;
            }
            if(l<n){
                for(int i=m-1;i>=k;i--){
                    System.out.print(a[i][l]+" ");
                }
                l++;
            }
        }
    }

    public static void main(String[] args) {
        int a[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        spiralMatrix(a,4,4);
    }
}
