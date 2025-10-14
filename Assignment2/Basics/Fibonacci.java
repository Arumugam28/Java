public class Fibonacci {
    public static int fibonacci(int n){
        if(n<=1) return n;
        else return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args){
        System.out.println("Fibonacci Series using Recursion:\n");
        for(int n=0; n<=10; n++){  
            System.out.println(fibonacci(n));
        }
    }   

}
