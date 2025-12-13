import java.util.*;
public class Cnd18{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        
       
        if(a<=10 ){
            System.out.println("single digit");
        }
        else if(a>10 && a<100){
            System.out.println("two digit");
        }
        else{
            System.out.println("three digit");
        }

    }
}