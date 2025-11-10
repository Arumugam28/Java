
class HashNode {
    int key;
    String value;
    HashNode next;
    public HashNode(int key,String value){
        this.key=key;
        this.value=value;
        this.next=null;
    }
}
class HashTable {
    private HashNode[] table;
    private int size;

    public HashTable(int capacity){
        table=new HashNode[capacity];
        size=capacity;
    }
    private int hash(int key){
        return key % size;
    }
    void insert(int key,String value){
        int index=hash(key);
        HashNode newNode=new HashNode(key,value);

        if(table[index]==null){
            table[index]=newNode;
        }else{
            HashNode temp=table[index];
            while(temp.next!=null){
                if(temp.key==key){
                    temp.value=value; 
                    return;
                }
                temp=temp.next;
            }
            temp.next=newNode;
        }
        System.out.println("Inserted ("+key+", "+value+") at index "+index);
    }
    String search(int key){
        int index=hash(key);
        HashNode temp=table[index];
        while(temp!=null){
            if(temp.key==key)
                return temp.value;
            temp=temp.next;
        }
        return null;
    }
    void delete(int key){
        int index=hash(key);
        HashNode temp=table[index];
        HashNode prev=null;

        while(temp!=null && temp.key!=key){
            prev=temp;
            temp=temp.next;
        }

        if(temp==null){
            System.out.println("Key "+key+" not found!");
            return;
        }

        if(prev==null)
            table[index]=temp.next;
        else
            prev.next=temp.next;

        System.out.println("Key "+key+" deleted successfully!");
    }
    void display(){
        System.out.println("\nHash Table:");
        for(int i=0;i<size;i++){
            System.out.print("Index "+i+": ");
            HashNode temp=table[i];
            while(temp!=null){
                System.out.print("("+temp.key+", "+temp.value+") -> ");
                temp=temp.next;
            }
            System.out.println("null");
        }
    }
}

public class MidlevelTask10 {
    public static void main(String[] args){
        HashTable ht=new HashTable(5);
        ht.insert(1,"Arun");
        ht.insert(2,"Banu");
        ht.insert(6,"Gokul");
        ht.insert(11,"Arun"); 
        ht.insert(3,"Murugan");
        ht.display();
        int keyToSearch=6;
        String result=ht.search(keyToSearch);
        if(result!=null)
            System.out.println("\nKey "+keyToSearch+" found with value: "+result);
        else
            System.out.println("\nKey "+keyToSearch+" not found!");
        ht.delete(2);
        ht.display();
    }
}
