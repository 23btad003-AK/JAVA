import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       for(int i=1;i<=n;i++){
       int sum=0;
       int temp=i;
       while(temp!=0){
       int fact=1;
           int a=temp%10;
           for(int j=1;j<=a;j++){
               fact=fact*j;
           }
           sum+=fact;
           temp=temp/10;
           
         }
         if(sum==i){
             System.out.println(i);
         }
       }
    }
}