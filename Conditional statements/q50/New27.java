import java.util.Scanner;

public class New27{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int balance=10000;
        int withdraw=sc.nextInt();
        if(withdraw<=balance && withdraw%100==0){
            System.out.println("cash withdrawing");
        }
        else{
            System.out.println("Insufficent balance");
        }
        
        
       
    }
}
        
