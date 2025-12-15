//Q19.Write a Java program to display mobile data usage alert – "Low Data", "Half Javaonsumed", or "Data Over" based on usage.
import java.util.*;
public class Hello4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int usage=sc.nextInt();
        if(usage<=50){
            System.out.println("Half consumed!!");
        }
        else if(usage>50 && usage<=90){
            System.out.println("Low Data!!!");
        }
        else{
            System.out.println("Data over!");
        }
        
        
    }
}
