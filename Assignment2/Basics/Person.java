class Person{
    String name;
    int age;
    String address;

    public Person(String name,int age,String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }

    public void displayPerson(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Address: "+address);
    }

    public static void main(String args[]){
        Student s1=new Student("Arumugam",21,"Madurai","A","ABC College");
        s1.displayStudent();
    }
}

class Student extends Person{
    String grade;
    String school;

    public Student(String name,int age,String address,String grade,String school){
        super(name,age,address);
        this.grade=grade;
        this.school=school;
    }

    public void displayStudent(){
        displayPerson();
        System.out.println("Grade: "+grade);
        System.out.println("School: "+school);
    }
}
