import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int n=0;
        while(n>0){
        n=sc.nextInt();
        sum+=n;
        n=0;
        }
    System.out.println(sum);
    }
}