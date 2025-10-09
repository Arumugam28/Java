import java.util.Arrays;

public class LongestIncreasingSubarray {
     public static void main(String[] args) {
        int[] arr1 = {1, 5, 3, 7};
        int[] arr2 = {10, 22, 33, 25, 32, 54, 64, 1};

        System.out.println("Input: " + Arrays.toString(arr1) + " Output: " + Arrays.toString(longestIncreasing(arr1)));
        System.out.println("Input: " + Arrays.toString(arr2) + " Output: " + Arrays.toString(longestIncreasing(arr2)));
    }
    public static int[] longestIncreasing(int[] arr){
        if(arr==null||arr.length==0) return new int[0];
        int bestStart = 0, bestLen = 1;
        int curStart = 0, curLen = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                curLen++;
            } else {
                if (curLen > bestLen) {
                    bestLen = curLen;
                    bestStart = curStart;
                }
                curStart = i;
                curLen = 1;
            }
        }
        if (curLen > bestLen) {
            bestLen = curLen;
            bestStart = curStart;
        }

        return Arrays.copyOfRange(arr, bestStart, bestStart + bestLen);

    }
    
}
