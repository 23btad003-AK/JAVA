import java.util.*;
public class Hello6{
    public static void main(String[] args){
     //Scanner sc=new Scanner(System.in);
     for(int i=100;i<=1000;i++){
     int sum=0;
     int prod=1;
     int temp=i;
         while(temp!=0){
             int a=temp%10;
             sum+=a;
             prod*=a;
             temp=temp/10;
         }
         if(sum==prod){
             System.out.println("Spy no : "+i);
         }
     }
    }
}