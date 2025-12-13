import java.util.*;
public class Cnd5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>=100 && a<=999){
            System.out.println("it is a three didgit number");
        }
        else{
            System.out.println("it is not a three digit number");
        }
    }
}