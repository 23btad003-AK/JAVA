import java.util.*;
public class Op13{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int h=sc.nextInt();
        double area=2*Math.PI*r*(r+h);
        double volume=Math.PI*Math.pow(r,2)*h;
        System.out.printf("area of cylinder:%.2f \nvolume of cylinder:%.2f",area,volume);
        
    }
}