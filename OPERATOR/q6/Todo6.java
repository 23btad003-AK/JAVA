import java.util.*;
public class Todo6{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        int temp=0;
        temp=a;
        a=b;
        b=temp;
        System.out.println("The value of a & b after swapping:"+a+ " "+b);
    }
    
    
}