//Q17.Write a Java program to assign different ticket prices based on day of the week (weekday/weekend).
import java.util.*;
public class Hello5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int ticket=200;
        System.out.println("ENter the day no of the week.....");
        System.out.println("MONDAY - 1 \nTUESDAY - 2 \n WEDNESDAY - 3 \nTHURSDAY- 4 \nFRIDAY - 5 \nSATURDAY - 6 \nSUNDAY - 7");

        
        int day=sc.nextInt();
        switch(day){
            case 1:
                ticket=ticket-50;
                break;
            case 2:
                ticket=ticket-40;
                break;
            case 3:
                ticket=ticket-30;
                break;
            case 4:
                ticket=ticket-20;
                break;
            case 5:
                ticket=ticket-10;
                break;
            case 6:
                ticket=ticket+20;
                break;
            case 7:
                ticket=ticket+40;
                break;
            default:
            System.out.println("Enter valid day: ");
        }
        System.out.println("ticket price: "+ticket);
    }
}