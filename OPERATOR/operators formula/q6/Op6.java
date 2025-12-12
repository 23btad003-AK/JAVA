import java.util.*;
public class Op6{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double fahrenheit=sc.nextDouble();
        double celsius=(fahrenheit-32)*5.0/9.0;
        System.out.printf("celsius for the given fahrenheit:"+"%.2f",celsius);
        
    }
}