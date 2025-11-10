class Vehicle1{
    String make;
    String model;
    int year;

    void displayVehicleInfo(){
        System.out.println("Make:"+make);
        System.out.println("Model:"+model);
        System.out.println("Year:"+year);
    }
}

class Car extends Vehicle1{
    String color;
    int numDoors;

    void displayCarInfo(){
        displayVehicleInfo();
        System.out.println("Color:"+color);
        System.out.println("Number of Doors:"+numDoors);
    }
}

public class Vehicle{
    public static void main(String args[]){
        Car c=new Car();
        c.make="Toyota";
        c.model="Camry";
        c.year=2022;
        c.color="White";
        c.numDoors=4;

        c.displayCarInfo();
    }
}
