import java.util.Scanner;

public class New23{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age=sc.nextInt();
        if(age>=60){
            System.out.println("Eligible for senior citizenships");
        }
        else{
            System.out.println("Not eligible");
        }
    }
}
        
