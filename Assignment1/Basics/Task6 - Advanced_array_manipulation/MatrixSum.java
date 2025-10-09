import java.util.Arrays;
public class MatrixSum {
    public static void main(String[] args) {
        int[][] A = { {1,2,3}, {4,5,6} };
        int[][] B = { {7,8,9}, {10,11,12} };
        int[][] C = addMatrices(A,B);
        System.out.println("Sum:");
        for(int i=0;i<C.length;i++) System.out.println(Arrays.toString(C[i]));
    }

    public static int[][] addMatrices(int[][] A,int[][] B){
        if(A==null || B==null) return null;
        int r=A.length;
        int c=A[0].length;
        if(B.length!=r || B[0].length!=c);
        int[][] res=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                res[i][j]=A[i][j]+B[i][j];
            }
        }
        return res;
    }
}