public class Vehicle {
    String make;
    String model;
    String year;
    public void setvehicle(String make, String model, String year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public void displayvechile(){
        System.out.println("Making : "+make);
        System.out.println("Model : "+model);
        System.out.println("Year : "+year);
    }
    public static void main(String[] args){
        Car  c = new Car();
        c.setvehicle("UK","AMG","2025");
        c.setcar("White", "TN 34 AJ 2805");
        c.display();

    }
}
class Car extends Vehicle{
    String color;
    String numdoors;
    public void setcar(String color, String numdoors) {
        this.color = color;
        this.numdoors = numdoors;

    }
    public void display(){
        displayvechile();
        System.out.println("color : "+color);
        System.out.println("Numdoors : "+numdoors);
        
    }

}
