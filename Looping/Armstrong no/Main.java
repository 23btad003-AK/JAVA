import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        while(temp!=0){
            int a=temp%10;
            int pow=(int)Math.pow(a,3);
            sum+=pow;
            temp=temp/10;
        }
        if(sum==n){
            System.out.println("It is armstrong number");
        }
        else{
            System.out.println("it is not an armstrong number");
        }
        
    }
}