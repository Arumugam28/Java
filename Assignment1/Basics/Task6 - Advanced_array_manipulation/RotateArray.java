import java.util.*;
public class RotateArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        int k = 2;
        rotateRight(a,k);
        System.out.println("Rotated: " + Arrays.toString(a));
    }

    public static void rotateRight(int[] arr,int k){
        if(arr==null || arr.length==0) return;
        int n=arr.length;
        k = k % n;
        if(k<0) k+=n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
    }

    private static void reverse(int[] arr,int i,int j){
        while(i<j){
            int t=arr[i]; arr[i]=arr[j]; arr[j]=t;
            i++; j--;
        }
    }
}
