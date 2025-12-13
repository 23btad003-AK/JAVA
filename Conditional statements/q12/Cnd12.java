import java.util.*;
public class Cnd12{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int last=a%100;
        if(last%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }

    }
}