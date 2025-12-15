import java.util.Scanner;

public class New24{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int battery=sc.nextInt();
        if(battery<=25){
            System.out.println("low battery");
        }
        else if(battery>25 && battery<=50){
            System.out.println("half battery percentage available");
        }
        else if(battery>=50){
            System.out.println("more than 50% battery");
        }
    }
}
        
