import java.util.*;
public class New5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a==b && b==c && c==a){
            System.out.println("Equalateral triangle");
        }
        else if(a==b ||b==c||c==a){
            System.out.println("Isosceles triangle");
        }
        else{
            System.out.println("Scalene triangle");
        }

        }
}