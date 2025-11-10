class Animal{
    void speak(){
        System.out.println("The animal says roar");
    }
}
class Dog extends Animal{
    void speak(){
        System.out.println("The dog says woow");
    }
}
class Cat extends Animal{
    void speak(){
        System.out.println("The cat says meow");
    }
}
public class Animalpoly{
    public static void main(String args[]){
        Animal a;
        a=new Animal();
        a.speak();
        a=new Dog();
        a.speak();
        a=new Cat();
        a.speak();
    }
}
