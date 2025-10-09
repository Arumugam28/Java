import java.util.Arrays;

public class OddEvenSort {
    public static void main(String[] args) {
        int[] arr1 = {13, 2, 4, 15, 12, 10, 5};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Input : " + Arrays.toString(arr1));
        System.out.println("Output: " + Arrays.toString(sortOddEven(arr1)));

        System.out.println("Input : " + Arrays.toString(arr2));
        System.out.println("Output: " + Arrays.toString(sortOddEven(arr2)));
    }

    public static int[] sortOddEven(int[] arr) {
        int n = arr.length;

        int oddCount = (n + 1) / 2; 
        int evenCount = n / 2;        

        int[] odd = new int[oddCount];
        int[] even = new int[evenCount];
        int oi = 0, ei = 0;
        for (int i = 0; i < n; i++) {
            if ((i + 1) % 2 == 1) odd[oi++] = arr[i];
            else even[ei++] = arr[i];
        }
        for (int i = 0; i < oddCount - 1; i++) {
            for (int j = i + 1; j < oddCount; j++) {
                if (odd[i] < odd[j]) {
                    int temp = odd[i];
                    odd[i] = odd[j];
                    odd[j] = temp;
                }
            }
        }
        for (int i = 0; i < evenCount - 1; i++) {
            for (int j = i + 1; j < evenCount; j++) {
                if (even[i] > even[j]) {
                    int temp = even[i];
                    even[i] = even[j];
                    even[j] = temp;
                }
            }
        }
        int[] result = new int[n];
        oi = 0;
        ei = 0;
        for (int i = 0; i < n; i++) {
            if ((i + 1) % 2 == 1) result[i] = odd[oi++];
            else result[i] = even[ei++];
        }

        return result;
    }
}
