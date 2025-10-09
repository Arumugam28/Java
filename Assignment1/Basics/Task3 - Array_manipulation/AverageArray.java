public class AverageArray {
    public static void main(String[] args) {
        double[] arr = {2.5, 3.5, 4.0, 5.0};
        double sum = 0;
        for(double n : arr){
            sum+=n;
        }
        double average = sum / arr.length;
        System.out.println("Average: " + average);
    }
    
}
