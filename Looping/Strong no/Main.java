import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int temp=n;
       int sum=0;
       while(temp!=0){
       int fact=1;
           int a=temp%10;
           for(int i=1;i<=a;i++){
               fact=fact*i;
           }
           sum+=fact;
           temp=temp/10;
           
         }
         if(sum==n){
             System.out.println("It is strong no");
         }
         else{
             System.out.println("It is not strong no");
         }
    }
}