class Shape1{
    int numSides;
    double area;

    void displayShapeInfo(){
        System.out.println("Number of Sides:"+numSides);
        System.out.println("Area:"+area);
    }
}

class Rectangle extends Shape1{
    double length;
    double width;

    void calculateArea(){
        area=length*width;
    }

    void displayRectangleInfo(){
        numSides=4;
        calculateArea();
        displayShapeInfo();
        System.out.println("Length:"+length);
        System.out.println("Width:"+width);
    }
}

public class Shape{
    public static void main(String args[]){
        Rectangle r=new Rectangle();
        r.length=10.5;
        r.width=5.2;

        r.displayRectangleInfo();
    }
}
