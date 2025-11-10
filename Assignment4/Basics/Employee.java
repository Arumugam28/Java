
class Employee {
    private String name;
    private double salary;
    private String hireDate;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }

    public double getSalary(){
        return salary;
    }
    public void setHireDate(String hireDate){
        this.hireDate=hireDate;
    }

    public String getHireDate(){
        return hireDate;
    }

    public static void main(String args[]){
        Employee e1=new Employee();
        e1.setName("Arumugam");
        e1.setSalary(55000.50);
        e1.setHireDate("08-11-2025");

        System.out.println("Employee Name: "+e1.getName());
        System.out.println("Salary: "+e1.getSalary());
        System.out.println("Hire Date: "+e1.getHireDate());
    }
}
