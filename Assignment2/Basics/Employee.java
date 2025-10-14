public class Employee {
    private String name = "Arun";
    private double salary = 250000;
    private String hireDate = "25/05/2024";
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getHireDate() {
        return hireDate;
    }
    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setName("Arumugam");
        System.out.println("Updated Empoyee Details : "+e.getName());
        e.setSalary(450000);
        System.out.println("Updated Empoyee Details : "+e.getSalary());
        e.setHireDate("17/02/2025");
        System.out.println("Updated Empoyee Details : "+e.getHireDate());
    }

}
