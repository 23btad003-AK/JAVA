import java.util.*;
public class Op7{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double celsius=sc.nextDouble();
        double f=(celsius+32)*9.0/5.0;
        System.out.printf("celsius for the given fahrenheit:"+"%.2f",f);
        
    }
}