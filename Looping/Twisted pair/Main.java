import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        boolean isprime1=false;
        boolean isprime2=false;
        int count1=0,count2=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count1++;
            }
        }
            if(count1==2){
                isprime1=true;
            }
            int rev=0;
            while(temp!=0){
                int a=temp%10;
                rev=(rev*10)+a;
                temp=temp/10;
            }
            for(int i=1;i<=rev;i++){
            if(n%i==0){
                count2++;
            }
        }
            if(count2==2){
                isprime2=true;
            }

            
            if(isprime1 && isprime2){
                System.out.println("It is a prime twisted");
            }
            else{
                System.out.println("It is not a prime twisted");
            }
            
    }
}