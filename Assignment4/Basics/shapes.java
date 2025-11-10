class Shape{
    void draw(){
        System.out.println("Drawing a shape");
    }
}

class Rectangle extends Shape{
    void draw(){
        System.out.println("Drawing a rectangle");
    }
}

class Circle extends Shape{
    void draw(){
        System.out.println("Drawing a circle");
    }
}

public class shapes{
    public static void main(String args[]){
        Shape s;

        s=new Shape();
        s.draw();

        s=new Rectangle();
        s.draw();

        s=new Circle();
        s.draw();
    }
}
