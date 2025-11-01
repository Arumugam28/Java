import java.util.ArrayList;
import java.util.List;

class GenericCollection<T> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public T getItem(int index) {
        return items.get(index);
    }

    public int size() {
        return items.size();
    }

    public void printItems() {
        for (T item : items) {
            System.out.println(item);
        }
    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " (" + age + ")";
    }
}

public class Generic {
    public static void printAny(GenericCollection<?> collection) {
        System.out.println("Printing collection with wildcard:");
        collection.printItems();
    }
    public static <T extends Number> double sum(GenericCollection<T> collection) {
        double total = 0;
        for (int i = 0; i < collection.size(); i++) {
            total += collection.getItem(i).doubleValue();
        }
        return total;
    }

    public static void main(String[] args) {
        GenericCollection<String> stringCollection = new GenericCollection<>();
        stringCollection.addItem("Hello");
        stringCollection.addItem("World");
        GenericCollection<Integer> integerCollection = new GenericCollection<>();
        integerCollection.addItem(10);
        integerCollection.addItem(20);
        integerCollection.addItem(30);
        GenericCollection<Person> personCollection = new GenericCollection<>();
        personCollection.addItem(new Person("Alice", 30));
        personCollection.addItem(new Person("Bob", 25));
        printAny(stringCollection);
        printAny(integerCollection);
        printAny(personCollection);
        double total = sum(integerCollection);
        System.out.println("Sum of integerCollection: " + total);
    }
}
