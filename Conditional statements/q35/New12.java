import java.util.*;
public class New12{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        int year2=sc.nextInt();
        int y1=year%10;
        int y2=year2%10;
        if(y1==y2){
            System.out.println("Same last digit");
        }
        else{
            System.out.println("Different last digit");
        }
    

        }
}