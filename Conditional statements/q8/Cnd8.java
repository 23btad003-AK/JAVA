import java.util.*;
public class Cnd8{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int last=a%10;
        if(last%3==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}