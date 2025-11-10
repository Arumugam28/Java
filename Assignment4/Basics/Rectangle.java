
class Rectangle {
    private double length;
    private double width;
    public void setLength(double length){
        this.length=length;
    }
    public double getLength(){
        return length;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public double getWidth(){
        return width;
    }
    public double getArea(){
        return length*width;
    }
    public double getPerimeter(){
        return 2*(length+width);
    }

    public static void main(String args[]){
        Rectangle r=new Rectangle();
        r.setLength(10.5);
        r.setWidth(6.2);

        System.out.println("Length: "+r.getLength());
        System.out.println("Width: "+r.getWidth());
        System.out.println("Area: "+r.getArea());
        System.out.println("Perimeter: "+r.getPerimeter());
    }
}
