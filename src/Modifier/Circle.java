package Modifier;

public class Circle {
    private double radius=1.0;
    private String color="red";
    private Circle(){}
    private Circle(double radius){
        this.radius=radius;
    }
public void setRadius(double radius){
        this.radius=radius;
}
    public double getRadius(){
        return this.radius;
    }
    public double getArea(){
        return this.radius*this.radius;
    }
    public static void main(String[] args) {
        Circle cricle=new Circle();
        cricle.setRadius(5);
        cricle.getRadius();
        System.out.println(cricle.getArea());
    }
}
