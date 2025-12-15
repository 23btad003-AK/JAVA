import java.util.Scanner;

public class New25{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int temperature=sc.nextInt();
        if(temperature>=100){
            System.out.println("you have fever");
        }
        else{
            System.out.println("you are ok");
        }
        
       
    }
}
        
