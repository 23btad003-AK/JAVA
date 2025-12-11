import java.util.*;
public class Print12{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.nextLine();
        System.out.println("Enter your door no and street:");
        String street=sc.nextLine();
        System.out.println("enter your city");
        String city=sc.nextLine();
        System.out.println(name+"\n "+street+ "\n" +city);
        
    }
}