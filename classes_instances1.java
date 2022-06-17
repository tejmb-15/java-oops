import java.util.*;
class Circle{
    private  double radius ;
    private String color ;
    public Circle(){
        this.radius=1.0;
        this.color="red";
    }
    public Circle(double r,String s){
        this.radius=r;
        this.color=s;
    }
    public double getRadius(){
        return this.radius;
    }
    public double getArea(){
        return 2*Math.PI*this.radius;
    }
    public double Circumference(){
        return Math.PI*this.radius*this.radius;
    }
}
public class Main{
public static void main(String args[]){
    Circle c= new Circle();
    System.out.println(c.getArea());
    System.out.print(c.Circumference());
}
}
