public class  SecondLargest {
    public static void main(String[] args) {
        int[] a = {5, 2, 11, 7, 11, 3};
        System.out.println("Second largest: " + secondLargest(a));
    }

    public static int secondLargest(int[] arr) {
        if(arr==null || arr.length<2) return Integer.MIN_VALUE;
        int first=Integer.MIN_VALUE, second=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int v=arr[i];
            if(v>first){
                second=first;
                first=v;
            } else if(v>second && v<first){
                second=v;
            }
        }
        if(second==Integer.MIN_VALUE){
            boolean allEqual=true;
            for(int i=1;i<arr.length;i++) if(arr[i]!=arr[0]) { allEqual=false; break; }
            if(allEqual) return arr[0];
        }
        return second;
    }
}