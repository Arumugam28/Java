import java.util.Arrays;
public class SortAscDesc {
    public static void main(String[] args) {
        int[] arr = {5,1,9,3,7};
        int[] asc = arr.clone();
        Arrays.sort(asc);
        System.out.println("Ascending: " + Arrays.toString(asc));

        int[] desc = new int[asc.length];
        for(int i=0;i<asc.length;i++) desc[i]=asc[asc.length-1-i];
        System.out.println("Descending: " + Arrays.toString(desc));
    }
}