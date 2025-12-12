import java.util.*;
public class Op13{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int b=sc.nextInt();
        int h=sc.nextInt();
        double area=2*((l*b)+(b*h)+(h*l));
        double volume=l*b*h;
        System.out.println("Area of cuboid:"+area +"\n Volume: "+volume);
        
    }
}