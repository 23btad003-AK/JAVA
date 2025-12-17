import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sq1=n*n;
        int n1=n%10;
        int sq2=n1*n1;
        int n2=sq1%100;
        if(sq2==n2){
            System.out.println("it is automorphic");
        }
        else{
            System.out.println("it is not automorphic");
        }
        
        
    }
}