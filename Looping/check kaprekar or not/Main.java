import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        int sq=n*n;
        while(temp!=0){
            int a=temp%100;
            sum+=a;
            temp=temp/100;
        }
        if(sum==n){
            System.out.println("It is kaprekar number");
        }
        else{
            System.out.println("It is not kaprekar number");
        }
    
}
}