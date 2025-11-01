import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    int id;
    String name;
    String department;

    Student(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Department: " + department;
    }
}
public class Serialization {
     public static void main(String[] args) {
        Student s1 = new Student(101, "Arumugam", "Computer Science");

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"));
            oos.writeObject(s1);
            oos.close();
            System.out.println("Object Serialized Successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.ser"));
            Student s2 = (Student) ois.readObject();
            ois.close();
            System.out.println("Deserialized Object: " + s2);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
