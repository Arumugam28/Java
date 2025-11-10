public class AdvancelevelTask11 {
    public static int fibonacci(int n){
        if(n<=1)
            return n; 
        else
            return fibonacci(n-1)+fibonacci(n-2);
    }

    public static void main(String args[]){
        int n1=5;
        int n2=10;
        int n3=15;

        System.out.println("Fibonacci("+n1+") = "+fibonacci(n1));
        System.out.println("Fibonacci("+n2+") = "+fibonacci(n2));
        System.out.println("Fibonacci("+n3+") = "+fibonacci(n3));
        int n=7;
        System.out.println("Fibonacci("+n+") = "+fibonacci(n));
    }
}
