
public class Averagecalc {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println("Average : "+calculateAverage(arr));
    }

    private static int calculateAverage(int[] arr) {
        int sum =0;
        for(int i : arr){
            sum = sum +i;
        }
        return sum/arr.length;
    }
}
