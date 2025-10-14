public class Student {
   private  String name = "Arumugam";
    private int age = 21;
    private char grade = 'B';
    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public char getGrade() {
        return grade;
    }


    public void setGrade(char grade) {
        this.grade = grade;
    }


    public static void main(String[] args){
        Student s = new Student();
        s.setName("AravindRaj");
        s.setAge(22);
        s.setGrade('A');
        System.out.println("Updated name : "+s.getName());
        System.out.println("Updated Age : "+s.getAge());
        System.out.println("Updated Grade : "+s.getGrade());

    }
    
}
