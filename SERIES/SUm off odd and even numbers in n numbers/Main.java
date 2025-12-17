import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int evensum=0,oddsum=0;
        for(int i=1;i<=n;i++){
            if(i%2==0)
            evensum+=i;
            else
            oddsum+=i;    
        }
        
        System.out.println("evenSum of "+evensum);
                System.out.println("ODDSum of "+oddsum);

    }
}