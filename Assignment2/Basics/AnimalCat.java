class Animal{
    String name;
    int age;
    String species;

    public Animal(String name,int age,String species){
        this.name=name;
        this.age=age;
        this.species=species;
    }

    public void displayAnimal(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Species: "+species);
    }
}

class AnimalCat extends Animal{
    String color;
    int numLives;

    public AnimalCat(String name,int age,String species,String color,int numLives){
        super(name,age,species);
        this.color=color;
        this.numLives=numLives;
    }

    public void displayCat(){
        displayAnimal();
        System.out.println("Color: "+color);
        System.out.println("Number of Lives: "+numLives);
    }

    public static void main(String args[]){
        AnimalCat c1=new AnimalCat("Kitty",3,"Persian Cat","White",9);
        c1.displayCat();
    }
}
