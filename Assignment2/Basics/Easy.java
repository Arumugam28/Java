public class Easy{
    public static int calculateAverage(int[] arr){
        int sum =0;
        for(int i : arr){
            sum+=i;
        }
        return sum/arr.length;

    }
    public static String reverseString(String str){
        String rev ="";
        for(int i=str.length()-1;i>=0;i--)
{
    rev += str.charAt(i);
}        return rev;

    }
    public static boolean isPalindrome(String str1){
        String rev = reverseString(str1);
        if(str1.equalsIgnoreCase(rev)) return true;
        return false;

    }
    public static int findMax(int[] arr){
        int max = arr[0];
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max) max = arr[i]; 
        }
        return max;

    }
    public static int calculateFactorial(int n){
        int fact =1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;

    }
    public static void main(String[] args){
        int[] arr = {2,4,5,3,8,9};
        System.out.println("Average of an Array : "+calculateAverage(arr));
        String str = "Arumugam";
        System.out.println("Reverse String : "+reverseString(str));
        String str1 = "madam";
        System.out.println("Palindrome : "+isPalindrome(str1));
        System.out.println("Finding Maximum Element : "+findMax(arr));
        int n =5;
        System.out.println("Factorial of "+n+" : "+calculateFactorial(n));

    }
}