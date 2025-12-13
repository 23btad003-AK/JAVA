import java.util.*;
public class Cnd20{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        int b=(int)a;
        
       
        if(b%2==0){
            System.out.println("even");
        }
       
        else{
            System.out.println("odd");
        }

    }
}