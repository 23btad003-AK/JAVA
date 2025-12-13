import java.util.*;
public class New11{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        int first=year/100;
        int last=year%100;
        if(first==last){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        }
}