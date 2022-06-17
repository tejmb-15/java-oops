import java.util.*;
import java.text.*;
class Date1{
    private int day;
    private int month;
    private int year;
    Date1(int d,int m,int y){
        day=d;
        month=m;
        year =y;
        
    }
    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
    public void setDate(int d){
        day=d;
    }
    public void setMonth(int m){
        month=m;
    }
    public void setYear(int y){
        year =y;
    }
    public void setDate(int d,int m,int y){
        day=d;
        month=m;
        year =y;
    }
    public String toString(){
        String s=month+"/"+day+"/"+year;
        Date d =new Date(s);
                System.out.println(d);

        SimpleDateFormat sdf =new SimpleDateFormat("dd/MM/YYYY");
        String s1=sdf.format(d);
        return s1;
    }
}
public class Main{
    public static void main(String args[]){
        Date1 dt =new Date1(15,8,2);
        System.out.println(dt);
        
    }
}
