import java.util.Arrays;
public class MultiplyMatrices {
    public static void main(String[] args) {
        int[][] A = { {1,2,3}, {4,5,6} };
        int[][] B = { {7,8}, {9,10}, {11,12} };
        int[][] C = multiply(A,B);
        System.out.println("Product:");
        for(int i=0;i<C.length;i++) System.out.println(Arrays.toString(C[i]));
    }

    public static int[][] multiply(int[][] A,int[][] B){
        if(A==null || B==null) return null;
        int m=A.length;
        int p=A[0].length;
        if(B.length!=p) throw new IllegalArgumentException("Incompatible dims");
        int n=B[0].length;
        int[][] C=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int sum=0;
                for(int k=0;k<p;k++){
                    sum += A[i][k]*B[k][j];
                }
                C[i][j]=sum;
            }
        }
        return C;
    }
}
