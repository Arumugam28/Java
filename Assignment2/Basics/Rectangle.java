public class Rectangle {
    int length;
    int width;
        
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    public int getArea(int length,int width){
        int area = length*width;
        return area;
    }
    public int getPerimeter(int length,int width){
        int perimeter = length+width/2;
        return perimeter;
    }

    public static void main(String[] args) {
        int length = 25;
        int width = 15;
        Rectangle r = new Rectangle(length, width);
        System.out.println("Area of the Rectangle : "+r.getArea(length,width));
        System.out.println("Area of the Rectangle : "+r.getPerimeter(length,width));
        
    }
}
