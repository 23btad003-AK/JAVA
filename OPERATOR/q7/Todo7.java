import java.util.*;
public class Todo7{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("The values after swapping :"+a+" "+b);
    }
    
    
}