
abstract class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand,int speed){
        this.brand=brand;
        this.speed=speed;
    }
    abstract void startEngine();
    void displayInfo(){
        System.out.println("Brand: "+brand+", Speed: "+speed+" km/h");
    }
}
class Car extends Vehicle {

    Car(String brand,int speed){
        super(brand,speed);
    }
    void startEngine(){
        System.out.println(brand+" car engine started. Ready to drive!");
    }
}
public class AdvancelevelTask1 {
    public static void main(String[] args){
        Car c1=new Car("Tesla",120);
        c1.displayInfo();
        c1.startEngine();
    }
}
