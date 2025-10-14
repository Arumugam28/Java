public class Animal {
    String name;
    int age;
    String species;
    public void setAnimal(String name,int age,String species){
        this.name = name;
        this.age = age;
        this.species = species;

    }
    public void displayAnimal(){
        System.out.println("Animal Name : "+name);
        System.out.println("Animal age  : "+age);
        System.out.println("Animal species : "+species);

    }

    public static void main(String[] args){
        Dog d = new Dog();
        d.setAnimal("Roscoe",3,"Dog");
        d.display("Labour","Brown");
    }
    
}
class Dog extends Animal{
    String breed;
    String color;

    public void display(String breed,String color){
        this.breed=breed;
        this.color=color;
        displayAnimal(); 
        System.out.println("Breed : "+breed);
        System.out.println("Color : "+color);
    }
}
