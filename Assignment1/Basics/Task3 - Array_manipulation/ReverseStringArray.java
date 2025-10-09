public class ReverseStringArray {
    public static void main(String[] args) {
        String[] arr = {"Apple", "Banana", "Cherry"};
        System.out.println("Array in reverse order:");
        for(int i = arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
    
}
