import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,temp=0;
        for(int i=1;i<=n;i++){
        sum=0;
        temp=i;
        while(temp!=0){
            int a=temp%10;
            int pow=(int)Math.pow(a,3);
            sum+=pow;
            temp=temp/10;
        }
        if(sum==i){
            System.out.println(i);
        }
        }
       
        
    }
}