public class SubsetsRecursion {
    public static void main(String[] args) {
        int[] set = {1,2,3};
        generateSubset(set,0,"");
    }

    public static void generateSubset(int[] set, int index, String ans){
        if(index==set.length){
            System.out.println(ans);
            return;
        }
        generateSubset(set,index+1, ans+set[index]+" ");
        generateSubset(set,index+1, ans);
    }
}
