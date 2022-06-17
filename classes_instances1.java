https://www3.ntu.edu.sg/home/ehchua/programming/java/images/ExerciseOOP_Circle_Final.png

/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
class Circle{
    private  double radius ;
    private String color ;
    public Circle(){
        this.radius=1.0;
        this.color="red";
    }
     public Circle(double radius){
        this.radius=radius;
        color="redu";
        
    }
    public Circle(double r,String s){
        radius=r;
        color=s;
    }
    public void setRadius(double radius){
        this.radius=radius;
        
    }
    public void setColor(String c){
        color=c;
    }
    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }
    public double getArea(){
        return 2*Math.PI*radius;
    }
    public double Circumference(){
        return Math.PI*radius*radius;
    }
    public String toString(){
        return radius+" "+color;
    }
}
public class Main{
public static void main(String args[]){
    Circle c= new Circle();
    Circle c1= new Circle(2.0);
        Circle c2= new Circle(3.0,"yellow");
        c1.setColor("green");
        c2.setRadius(6.0);
System.out.println(c.toString());
System.out.println(c1.toString());
System.out.println(c2.toString());
   System.out.println(c.getArea());
    System.out.println(c.Circumference());
     System.out.println(c1.getArea());
    System.out.println(c1.Circumference());
     System.out.println(c2.getArea());
    System.out.println(c2.Circumference());
     System.out.println(c1.getColor());
    System.out.print(c2.getRadius());
    
}
}
