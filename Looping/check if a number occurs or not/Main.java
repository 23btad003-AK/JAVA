import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        boolean isoccurs=false;
        int n=sc.nextInt();
        int n2=sc.nextInt();
        int temp=n;
        while(temp!=0){
            int last=temp%10;
            if(last==n2){
            isoccurs=true;
            break;
            }
            temp=temp/10;
            
            
        }
        if(isoccurs)
        System.out.println("It occurs");
        else
        System.out.println("DOes not occur");
        
        
    }
}