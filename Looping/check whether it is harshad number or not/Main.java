import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int temp=n;
        while(temp!=0){
            int a=temp%10;
            sum+=a;
            temp=temp/10;
        }
        if(n%sum==0){
            System.out.println("It is harshad number");
        }
        else{
            System.out.println("It is not harshad number");
        }
       
    }
}