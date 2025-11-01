import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        int dataSize = 100000;
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        long start = System.currentTimeMillis();
        for (int i = 0; i < dataSize; i++) {
            arrayList.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("ArrayList add: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < dataSize; i++) {
            linkedList.add(i);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList add: " + (end - start) + " ms");
        start = System.currentTimeMillis();
        for (int i = 0; i < dataSize; i++) {
            arrayList.get(i);
        }
        end = System.currentTimeMillis();
        System.out.println("ArrayList access: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < dataSize; i++) {
            linkedList.get(i);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList access: " + (end - start) + " ms");
        start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            arrayList.remove(0);
        }
        end = System.currentTimeMillis();
        System.out.println("ArrayList remove from start: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            linkedList.remove(0);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList remove from start: " + (end - start) + " ms");
    }
}
