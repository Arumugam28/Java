public class Shape {
    int numSides;
    double area;
    public void setshape(int numSides, double area){
        this.numSides = numSides;
        this.area = area;
    }
    public void diplayshape(){
        System.out.println("Numsides : "+numSides);
        System.out.println("Area : "+area);
    }
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setrectangle(15,8);
        r.setshape(4,25);
        r.display();
    }
    
}
class Rectangle extends Shape{
    Double length;
    double width;
    public void setrectangle(double length,double width){
        this.length = length;
        this.width = width;
    }
    public  void display(){
        diplayshape();
        System.out.println("Length : "+length);
        System.out.println("Width : "+width);

}
}