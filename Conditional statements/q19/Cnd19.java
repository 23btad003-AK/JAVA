import java.util.*;
public class Cnd19{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int prod=a*b;
       
        if(prod>0){
            System.out.println("yes,it is positive");
        }
       
        else{
            System.out.println("No");
        }

    }
}