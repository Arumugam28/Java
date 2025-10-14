public class Animalpoly {
    public void speak(){
        System.out.println("The animal says roar");
    }
    public static void main(String[] args) {
        Animalpoly a = new Animalpoly();
        a.speak();
        Dog d = new Dog();
        d.speak();
        Cat c = new Cat();
        c.speak();
    }
    
}
class Dog extends Animalpoly{
    public void speak(){
        System.out.println("The dog says woof");
    }
}
class Cat extends Animalpoly{
    public void speak(){
        System.out.println("The cat says meow");
    }
}