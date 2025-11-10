import java.util.*;

public class AdvancelevelTask10 {
    public static int[] generateArray(int size){
        Random rand = new Random();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=rand.nextInt(100000);
        }
        return arr;
    }
    public static void bubbleSort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void selectionSort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }
    public static void insertionSort(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    public static void quickSort(int arr[], int low, int high){
        if(low<high){
            int pi=partition(arr,low,high);
            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);
        }
    }

    public static int partition(int arr[], int low, int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }
    public static long measureTime(Runnable sortMethod){
        long start=System.nanoTime();
        sortMethod.run();
        long end=System.nanoTime();
        return end-start;
    }

    public static void main(String args[]){
        int size=10000;
        int original[]=generateArray(size);
        System.out.println("Sorting "+size+" random numbers...\n");
        int a1[]=Arrays.copyOf(original,original.length);
        int a2[]=Arrays.copyOf(original,original.length);
        int a3[]=Arrays.copyOf(original,original.length);
        int a4[]=Arrays.copyOf(original,original.length);
        long t1=measureTime(() -> bubbleSort(a1));
        long t2=measureTime(() -> selectionSort(a2));
        long t3=measureTime(() -> insertionSort(a3));
        long t4=measureTime(() -> quickSort(a4,0,a4.length-1));
        System.out.println("Bubble Sort Time: "+t1/1_000_000.0+" ms");
        System.out.println("Selection Sort Time: "+t2/1_000_000.0+" ms");
        System.out.println("Insertion Sort Time: "+t3/1_000_000.0+" ms");
        System.out.println("Quick Sort Time: "+t4/1_000_000.0+" ms");
    }
}
