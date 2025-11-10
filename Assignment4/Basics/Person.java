class Person1{
    String name;
    int age;
    String address;

    void displayPersonInfo(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Address:"+address);
    }
}

class Student extends Person1{
    String grade;
    String school;

    void displayStudentInfo(){
        displayPersonInfo();
        System.out.println("Grade:"+grade);
        System.out.println("School:"+school);
    }
}

public class Person{
    public static void main(String args[]){
        Student s=new Student();
        s.name="Arun";
        s.age=20;
        s.address="Chennai";
        s.grade="A";
        s.school="ABC Higher Secondary School";

        s.displayStudentInfo();
    }
}
