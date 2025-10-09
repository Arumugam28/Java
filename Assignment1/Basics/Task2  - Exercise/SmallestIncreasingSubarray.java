
import java.util.*;

public class SmallestIncreasingSubarray {
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 3, 7};
        int[] arr2 = {10, 22, 33, 25, 32, 54, 64, 1};

        System.out.println("Input: " + Arrays.toString(arr1) + " Output: " + Arrays.toString(smallestIncreasing(arr1)));
        System.out.println("Input: " + Arrays.toString(arr2) + " Output: " + Arrays.toString(smallestIncreasing(arr2)));
    }

     public static int[] smallestIncreasing(int[] arr) {
        if (arr.length < 2) return new int[0];

        int start = 0;
        int minStart = 0;  
        int curLen = 1;  
        int minLen = Integer.MAX_VALUE; 

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                curLen++;
            } else {
                if (curLen >= 2 && curLen < minLen) {
                    minLen = curLen;
                    minStart = start;
                }
                start = i;
                curLen = 1;
            }
        }
        if (curLen >= 2 && curLen < minLen) {
            minLen = curLen;
            minStart = start;
        }

        if (minLen == Integer.MAX_VALUE) return new int[0]; // no increasing sub-array
        int[] result = new int[minLen];
        for (int i = 0; i < minLen; i++) {
            result[i] = arr[minStart + i];
        }

        return result;
    }
}
