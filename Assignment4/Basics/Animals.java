class Animals1{
    String name;
    int age;
    String species;

    void displayAnimalInfo(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Species:"+species);
    }
}

class Cat extends Animals1{
    String color;
    int numLives;

    void displayCatInfo(){
        displayAnimalInfo();
        System.out.println("Color:"+color);
        System.out.println("Number of Lives:"+numLives);
    }
}

public class Animals{
    public static void main(String args[]){
        Cat c=new Cat();
        c.name="Kitty";
        c.age=2;
        c.species="Feline";
        c.color="White";
        c.numLives=9;

        c.displayCatInfo();
    }
}
