//Q20.Write a Java program to Javaheck if vehicle speed exceeds 100 km/h.("Over-speeding! Fine imposed.","Speed iswithin limit")
import java.util.*;
public class Hello3{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int speed=sc.nextInt();
        if(speed>=100){
            System.out.println("Over-speeding!Fine imposed");
        }
        else{
            System.out.println("Speed is within limits");
        }
    }
}
