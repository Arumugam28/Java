class Animal1{
    String name;
    int age;
    String species;

    void displayInfo(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Species:"+species);
    }
}

class Dog extends Animal1{
    String breed;
    String color;

    void displayDogInfo(){
        displayInfo();
        System.out.println("Breed:"+breed);
        System.out.println("Color:"+color);
    }
}

public class Animal{
    public static void main(String args[]){
        Dog d=new Dog();
        d.name="Tommy";
        d.age=3;
        d.species="Canine";
        d.breed="Labrador";
        d.color="Brown";

        d.displayDogInfo();
    }
}
