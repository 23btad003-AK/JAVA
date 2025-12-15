//Q18.Write a Java program to calculate water bill using slab rates (≤1000 liters free, next 2000 @ ₹5, above @ ₹10 per 1000 liters).
import java.util.*;
public class Hello4{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int waterusage=sc.nextInt();
        int bill=0;
        if(waterusage<=1000){
            bill=0;
            System.out.println("consumption is below 1000.Bill = 0");
            return ;
        }
        else if(waterusage<=3000){
            bill=((waterusage-1000)/1000)*5;
        }
        else {
            bill=((2000*5)/1000)+((waterusage - 3000)/1000)*10;
            
        }
        System.out.println("Water bill = "+bill);
    }
    
}