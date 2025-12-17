import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int num=1;
            for(int j=1;j<=n;j++){
                if(i==n||j==1||i==j||i>j)
                System.out.print(num++ +" ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
        
        

        
    }
}