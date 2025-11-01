import java.util.LinkedList;
import java.util.Iterator;

public class HashTable {
    private LinkedList<Integer>[] table;
    private int capacity; 
    private int size;      

    @SuppressWarnings("unchecked")
    public HashTable(int capacity) {
        this.capacity = capacity;
        table = new LinkedList[capacity];
        for(int i=0;i<capacity;i++)
            table[i] = new LinkedList<>();
        size = 0;
    }
    private int hash(int key) {
        int h = key % capacity;
        if(h < 0) h += capacity;
        return h;
    }

    public boolean insert(int key) {
        int idx = hash(key);
        LinkedList<Integer> bucket = table[idx];
        if(bucket.contains(key)) {
            return false; 
        }
        bucket.addFirst(key); 
        size++;
        return true;
    }

    public boolean contains(int key) {
        int idx = hash(key);
        return table[idx].contains(key);
    }
    public boolean delete(int key) {
        int idx = hash(key);
        LinkedList<Integer> bucket = table[idx];
        Iterator<Integer> it = bucket.iterator();
        while(it.hasNext()) {
            if(it.next().equals(key)) {
                it.remove();
                size--;
                return true;
            }
        }
        return false; 
    }

    
    public int size() {
        return size;
    }

    public void printTable() {
        for(int i=0;i<capacity;i++) {
            System.out.print("Bucket " + i + ": ");
            for(int key : table[i]) {
                System.out.print(key + " -> ");
            }
            System.out.println("null");
        }
    }


    public static void main(String[] args) {
        HashTable ht = new HashTable(7);

        int[] keys = {10, 3, 17, 24, 31, 7, -4, 10};
        for(int k:keys) {
            boolean ins = ht.insert(k);
            System.out.println("Insert " + k + ": " + ins);
        }
        System.out.println("\nTable after inserts:");
        ht.printTable();
        System.out.println("\nContains 17? " + ht.contains(17));
        System.out.println("Contains 99? " + ht.contains(99));
        System.out.println("\nDelete 17: " + ht.delete(17));
        System.out.println("Delete 99: " + ht.delete(99));
        System.out.println("\nTable after deletes:");
        ht.printTable();
        System.out.println("\nSize: " + ht.size());
    }
}
