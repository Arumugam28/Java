
public class Max {
    public static void main(String[] args) {
        int[] arr = {10,30,20,45,8,50};
        System.out.println(findMax(arr));
    }
    public static int findMax(int[] arr){
        int max = arr[0];
        for(int i : arr){
            if(i>max){
                max = i;
            }
        }
        return max;
    }
}
