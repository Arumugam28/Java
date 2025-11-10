import java.util.Scanner;

public class MidlevelTask6{
    public static void main(String args[]){
        int arr[]={10,20,30,40,50,60,70,80,90};
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter element to search: ");
        int key=sc.nextInt();
        int result=binarySearch(arr,key);
        if(result==-1)
            System.out.println("Element not found in the array");
        else
            System.out.println("Element found at index: "+result);
    }
    static int binarySearch(int arr[],int key){
        int low=0;
        int high=arr.length-1;

        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid]==key)
                return mid;
            else if(arr[mid]<key)
                low=mid+1;
            else
                high=mid-1;
        }
        return -1;
    }
}
