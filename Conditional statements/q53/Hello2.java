//Q16.Write a Java program to validate a mobile number . If it has 10 or more digits, print “Valid Number”, otherwise print “Invalid Number”.
import java.util.*;
public class Hello2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        int count=0;
        while(n!=0){
            n=n/10;
            count++;
        }
        if(count>=10){
            System.out.println("Valid number");
        }
        else{
            System.out.println("Not valid");
        }
    }
}