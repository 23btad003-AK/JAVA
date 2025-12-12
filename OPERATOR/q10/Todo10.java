import java.util.*;
public class Todo10{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int lastdigit=n%10;
        int firstdigit=n/100;
        int sum=firstdigit+lastdigit;
        
        
        System.out.println("The last didgit of number is "+sum);
    }
    
    
}