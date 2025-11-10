class MidlevelTask9 {
    static void solve(int n,char fromRod,char toRod,char auxRod){
        if(n==1){
            System.out.println("Move disk 1 from "+fromRod+" to "+toRod);
            return;
        }
        solve(n-1,fromRod,auxRod,toRod);
        System.out.println("Move disk "+n+" from "+fromRod+" to "+toRod);
        solve(n-1,auxRod,toRod,fromRod);
    }

    public static void main(String[] args){
        int n=3;
        System.out.println("Tower of Hanoi solution for "+n+" disks:\n");
        solve(n,'A','C','B'); 
    }
}
