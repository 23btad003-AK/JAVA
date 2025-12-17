import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp1=n;
        int sq1=n*n;
        int revn=0;
        while(temp1!=0){
            int a=temp1%10;
            revn=(revn*10)+a;
            temp1/=10;
        }
        int sqrev=0;
        int sq2=revn*revn;
        int temp2=sq2;
        while(temp2!=0){
            int b=temp2%10;
            sqrev=(sqrev*10)+b;
            temp2/=10;
        }
        if(sq1==sqrev){
            System.out.println("it is adam number");
        }
        else{
            System.out.println("It is not an adam number");
        }
        
        
    }
}