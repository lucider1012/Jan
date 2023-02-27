package day0213.oop;

class Circle{
    private double radius;
    private static final double PI = 3.141592;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius* PI;
    }
}
class Cylinder {
    private Circle c;
    private double height;
    public Cylinder(Circle c, double height) {
        this.c = c;
        this.height = height;
    }
    public double getVolume(){
        return c.getArea()*height;
    }

}

public class CylinderTest  {
    public static void main(String[] args){
        Cylinder cylinder = new Cylinder(new Circle(2.8), 5.6);
        System.out.printf("원통의 부피: %.4f", cylinder.getVolume());
    }
}
