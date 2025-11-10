
public class Palindrome {
    public static void main(String[] args) {
        String str = "Madam";
        System.out.println(isPalindrome(str));
    }
    public static boolean isPalindrome(String str){
        String revstr = "";
        for(int i=str.length()-1;i>=0;i--){
            revstr += str.charAt(i);
        }
        if(revstr.equalsIgnoreCase(str)){
            return true;
        }
        return false;
        
    }
}
