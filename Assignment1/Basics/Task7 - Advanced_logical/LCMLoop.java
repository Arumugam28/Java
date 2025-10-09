public class LCMLoop {
    public static void main(String[] args) {
        int a=12,b=15;
        System.out.println("LCM of "+a+" and "+b+" = "+lcm(a,b));
    }

    public static int lcm(int a,int b){
        int max = Math.max(a,b);
        while(true){
            if(max%a==0 && max%b==0) return max;
            max++;
        }
    }
}
