class NumberThread extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("Number: "+i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

public class AdvancelevelTask5{
    public static void main(String[] args){
        NumberThread t1=new NumberThread();
        t1.start();
    }
}
