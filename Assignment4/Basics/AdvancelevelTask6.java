import java.util.*;

class GenericStore<T>{
    private List<T> items=new ArrayList<T>();

    public void addItem(T item){
        items.add(item);
    }
    public void showItems(){
        for(T item:items){
            System.out.println(item);
        }
    }
    public static void displayAll(GenericStore<?> store){
        store.showItems();
    }
    public static double sumNumbers(GenericStore<? extends Number> store){
        double sum=0;
        for(Number n:store.items){
            sum+=n.doubleValue();
        }
        return sum;
    }
}
class Person{
    String name;
    int age;
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String toString(){
        return name+" ("+age+" yrs)";
    }
}

public class AdvancelevelTask6{
    public static void main(String[] args){
        GenericStore<String> stringStore=new GenericStore<String>();
        stringStore.addItem("Apple");
        stringStore.addItem("Banana");
        GenericStore<Integer> intStore=new GenericStore<Integer>();
        intStore.addItem(10);
        intStore.addItem(20);
        intStore.addItem(30);
        GenericStore<Person> personStore=new GenericStore<Person>();
        personStore.addItem(new Person("Arumugam",22));
        personStore.addItem(new Person("Kumar",25));

        System.out.println("String Store");
        GenericStore.displayAll(stringStore);

        System.out.println("\nInteger Store");
        GenericStore.displayAll(intStore);

        System.out.println("\nSum of Integer Store: "+GenericStore.sumNumbers(intStore));

        System.out.println("\nPerson Store");
        GenericStore.displayAll(personStore);
    }
}
