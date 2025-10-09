public class ThirdLargest {
    public static void main(String[] args) {
        int[] arr1 = {10, 5, 11, 100, 15, 12, 13};
        int[] arr2 = {0, 1};
        int[] arr3 = {1, 1, 1, 1};

        System.out.println("Output 1: " + findThirdLargest(arr1)); 
        System.out.println("Output 2: " + findThirdLargest(arr2)); 
        System.out.println("Output 3: " + findThirdLargest(arr3)); 
    }

    public static int findThirdLargest(int[] arr) {
        if (arr.length < 3)
            return -1;

        
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second && num < first) {
                third = second;
                second = num;
            } else if (num > third && num < second) {
                third = num;
            }
        }

        
        if (third == Integer.MIN_VALUE)
            return 1;

        return third;
    }
}
