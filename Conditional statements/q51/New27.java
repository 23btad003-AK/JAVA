import java.util.Scanner;

public class New27{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String traffic_light=sc.nextLine();
        if(traffic_light.equals("red")){
        System.out.println("Stop");
        }
        else if (traffic_light.equals("yellow")){
            System.out.println("GET ready");
        }
        else if(traffic_light.equals("green")){
            System.out.println("Go");
        }
        
        
       
    }
}
        
