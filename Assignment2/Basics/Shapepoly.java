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

public class Shapepoly{
    public static void main(String[] args){
        Shape s=new Shape();
        s.draw();

        Shape r=new Rectangle();
        r.draw();

        Shape c=new Circle();
        c.draw();
    }
}
