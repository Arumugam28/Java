import java.util.Scanner;

public class BinarySearchExample{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter "+n+" sorted elements:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int result = binarySearch(arr, 0, n-1, key);

        if(result == -1)
            System.out.println("Element not found.");
        else
            System.out.println("Element found at position: "+(result+1));
        sc.close();
    }

    public static int binarySearch(int[] arr, int low, int high, int key){
        while(low <= high){
            int mid = (low + high) / 2;

            if(arr[mid] == key)
                return mid;
            else if(arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
}
