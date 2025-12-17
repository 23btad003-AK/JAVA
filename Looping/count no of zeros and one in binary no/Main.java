import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int zerocount=0;
        int onecount=0;
        int temp=n;
        while(temp!=0){
            int a=temp%10;
            if(a==1)
            onecount++;
            if(a==0)
            zerocount++;
            temp=temp/10;
        }
        System.out.println("NUmber of zeroes in this binary: "+zerocount);
        System.out.println("Number of ones in this binary: "+onecount);
        
    }
}