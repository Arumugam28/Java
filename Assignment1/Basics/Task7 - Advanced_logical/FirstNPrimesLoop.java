public class FirstNPrimesLoop {
    public static void main(String[] args) {
        int n=10,count=0,num=2;
        System.out.print("First "+n+" primes: ");
        while(count<n){
            if(isPrime(num)){
                System.out.print(num+" ");
                count++;
            }
            num++;
        }
    }

    public static boolean isPrime(int x){
        if(x<2) return false;
        for(int i=2;i<=Math.sqrt(x);i++)
            if(x%i==0) return false;
        return true;
    }
}
