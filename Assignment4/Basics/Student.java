
class Student {
    private String name;
    private int age;
    private double grade;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public void setGrade(double grade){
        this.grade=grade;
    }
    public double getGrade(){
        return grade;
    }

    public static void main(String args[]){
        Student s1=new Student();
        s1.setName("Arumugam");
        s1.setAge(21);
        s1.setGrade(9.2);

        System.out.println("Name: "+s1.getName());
        System.out.println("Age: "+s1.getAge());
        System.out.println("Grade: "+s1.getGrade());
    }
}
