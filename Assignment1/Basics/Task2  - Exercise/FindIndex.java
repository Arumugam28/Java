import java.util.Arrays;

public class FindIndex {
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 3, 7};
        int key1 = 1;

        int[] arr2 = {10, 22, 33, 25, 32, 54, 64, 1};
        int key2 = 100;
        System.out.println("Input: " + Arrays.toString(arr1) + ", " + key1 + " Output: " + findIndex(arr1, key1));
        System.out.println("Input: " + Arrays.toString(arr2) + ", " + key2 + " Output: " + findIndex(arr2, key2));
    }
    public static int findIndex(int[] arr,int tar){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == tar) return i;
        }
        return -1;
    }
    
}

