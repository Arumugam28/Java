import java.util.Arrays;

public class DistinctNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 3, 1, 5};

        System.out.println("Input: " + Arrays.toString(arr));

        int[] result = new int[arr.length];
        int k = 0; 

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            
            if (count == 1) {
                result[k++] = arr[i];
            }
        }

        
        System.out.print("Output: [");
        for (int i = 0; i < k; i++) {
            System.out.print(result[i]);
            if (i < k - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
