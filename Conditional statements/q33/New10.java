import java.util.*;
public class New10{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
       if(year%100==0){
           System.out.println("Century");
       }
       else{
           System.out.println("Not Century");
       }

        }
}