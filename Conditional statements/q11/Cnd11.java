import java.util.*;
public class Cnd11{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        a=a/100;
        if(a%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }

    }
}