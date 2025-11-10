
public class Stringrev {

    public static void main(String[] args) {
        String str = "Arun";
        System.out.println(reverseString(str));
    }

    private static String reverseString(String str) {
        String revstr = "";
        for(int i=str.length()-1;i>=0;i--){
            revstr += str.charAt(i);
        }
        return revstr;
    }
}
