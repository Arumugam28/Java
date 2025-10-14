import java.util.Arrays;

public class Sorting {
    public void bubblesort(int[] arr){
        int n = arr.length;
        int swap = 0;
        int comp = 0;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                comp+=1;
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap+=1;
                }
            }
        }
        System.out.println("Bubble sort : "+Arrays.toString(arr)+"  Iteration Comparison : "+comp+"  Swap : "+swap);

    }
    public void selectionsort(int[] arr){
        int n = arr.length;
        int comp =0;
        int swap =0;
        for(int i=0;i<=n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                comp+=1;
                if(arr[j]<arr[min]){
                    min=j;
                }
            }

            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
            swap+=1;
        }
        System.out.println("Selection Sort : "+Arrays.toString(arr)+"  Iteration Comparison : "+comp+"  Swap : "+swap);
        
    }
    public void insertionsort(int[] arr){
        int n = arr.length;
        int comp=0;
        int swap =0;
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0){
                comp++;
                if(arr[j]>key){
                    arr[j+1]=arr[j];
                    swap++;
                    j--;
                } else {
                    break;
                }
            }
            arr[j+1]=key;
        }
        System.out.println("Insertion Sort : "+Arrays.toString(arr)+"  Iteration Comparison : "+comp+"  Swap : "+swap);
    }
    public void quickSort(int[] arr,int left,int right){
        if(left<right){
            int pi = partition(arr,left,right);
            quickSort(arr, left, pi-1);
            quickSort(arr,pi+1,right);
        }
    }
 
    public int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<=pivot){
                i++;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;

    }
    public static void main(String[] args) {
        int[] arr = {34,45,23,11,78,56,42,39,69,90};
        Sorting s = new Sorting();
        s.bubblesort(arr);
        s.selectionsort(arr);
        s.insertionsort(arr);
        s.quickSort(arr, 0, arr.length-1);
        System.out.print("Quick Sort : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
