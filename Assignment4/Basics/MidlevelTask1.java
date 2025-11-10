class Vehicle{
    String brand;
    int speed;
    void startEngine(){
        System.out.println(brand+" engine started");
    }
    void stopEngine(){
        System.out.println(brand+" engine stopped");
    }
}
class Car extends Vehicle{
    int numDoors;

    void playMusic(){
        System.out.println("Playing music inside the car");
    }
}
public class MidlevelTask1{
    public static void main(String args[]){
        Vehicle v=new Vehicle();
        v.brand="Tata";
        v.speed=80;
        v.startEngine();
        v.stopEngine();
        Car c=new Car();
        c.brand="Hyundai";
        c.speed=120;
        c.numDoors=4;
        c.startEngine();
        c.playMusic();
        c.stopEngine();
    }
}
