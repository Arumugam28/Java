import java.util.Arrays;
public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] A = { {1,2,3}, {4,5,6} };
        int[][] T = transpose(A);
        System.out.println("Transpose:");
        for(int i=0;i<T.length;i++) System.out.println(Arrays.toString(T[i]));
    }

    public static int[][] transpose(int[][] A){
        if(A==null) return null;
        int r=A.length;
        int c=A[0].length;
        int[][] T=new int[c][r];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                T[j][i]=A[i][j];
            }
        }
        return T;
    }
}