import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        int sqr=n*n;
        
        while(sqr!=0){
            int a=sqr%10;
            sum+=a;
            sqr=sqr/10;
        }
        if(sum==temp){
            System.out.println("It is a neon Number");
        }
        else{
            System.out.println("It is not a neon number");
        }
    }
}