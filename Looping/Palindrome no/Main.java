import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int temp=n;
	    int rev=0;
	    while(n!=0){
	        rev=(rev*10)+n%10;
	        n=n/10;
	    }
	    if(temp==rev)
	    System.out.printf("Palindrome number");
		else
		System.out.println("NOt A Palindrome");
	}
}
