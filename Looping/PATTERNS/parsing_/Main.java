import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
            int k=1;
        for(int i=1;i<=n;i++){
            
            for(int j=1;j<=n;j++){
                if(i+j>=n+1)
                System.out.printf("%02d ",k++);
        }
            System.out.println();
       }
}
}