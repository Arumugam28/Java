public class PrimeCheckRecursion {
     public static void main(String[] args) {
        int n=29;
        if(isPrime(n,n/2))
            System.out.println(n+" is prime");
        else
            System.out.println(n+" is not prime");
    }

    public static boolean isPrime(int n, int i){
        if(i==1) return true;
        if(n%i==0) return false;
        return isPrime(n,i-1);
    }
}
