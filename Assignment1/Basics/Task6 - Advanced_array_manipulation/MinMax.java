public class MinMax {
    public static void main(String[] args) {
        int[] arr = {10, -2, 33, 7, 0};
        int[] mm = minMax(arr);
        System.out.println("Min = " + mm[0] + ", Max = " + mm[1]);
    }

    public static int[] minMax(int[] arr) {
        if(arr==null || arr.length==0) return new int[]{0,0};
        int min=arr[0], max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min) min=arr[i];
            if(arr[i]>max) max=arr[i];
        }
        return new int[]{min,max};
    }
    
}
