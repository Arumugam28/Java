import java.util.*;

public class AdvancelevelTask4 {
    public static void main(String[] args){
        int n=100000;
        ArrayList<Integer> arrayList=new ArrayList<Integer>();
        LinkedList<Integer> linkedList=new LinkedList<Integer>();
        long start=System.nanoTime();
        for(int i=0;i<n;i++){
            arrayList.add(i);
        }
        long end=System.nanoTime();
        System.out.println("ArrayList Add Time: "+(end-start)+" ns");
        start=System.nanoTime();
        for(int i=0;i<n;i++){
            linkedList.add(i);
        }
        end=System.nanoTime();
        System.out.println("LinkedList Add Time: "+(end-start)+" ns");
        start=System.nanoTime();
        for(int i=0;i<1000;i++){
            arrayList.get(i);
        }
        end=System.nanoTime();
        System.out.println("ArrayList Access Time: "+(end-start)+" ns");

        start=System.nanoTime();
        for(int i=0;i<1000;i++){
            linkedList.get(i);
        }
        end=System.nanoTime();
        System.out.println("LinkedList Access Time: "+(end-start)+" ns");
        start=System.nanoTime();
        for(int i=0;i<1000;i++){
            arrayList.remove(0);
        }
        end=System.nanoTime();
        System.out.println("ArrayList Remove Time: "+(end-start)+" ns");

        start=System.nanoTime();
        for(int i=0;i<1000;i++){
            linkedList.remove(0);
        }
        end=System.nanoTime();
        System.out.println("LinkedList Remove Time: "+(end-start)+" ns");
    }
}
