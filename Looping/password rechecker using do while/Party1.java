import java.util.*;

public class Party1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,n1;
        do{
            
            System.out.println("ENter your password:");
            n=sc.nextInt();
            System.out.println("Re Enter your password:");
            n1=sc.nextInt();
            
        }while(n!=n1);
        if(n==n1){
            System.out.println("Your password is created successfully");
        }
        
}
}
