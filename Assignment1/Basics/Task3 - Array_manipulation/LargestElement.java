public class LargestElement {
    public static void main(String[] args) {
        int[] arr1 ={3,4,6,7,3,2};
        int max = arr1[0];
        for(int n : arr1){
            if(max<n) max=n;
        }
        System.out.println("Largest element: " + max);
    }
    
}
