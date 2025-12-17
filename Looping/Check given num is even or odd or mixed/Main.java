import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    boolean even=false,odd=false;
	    int temp=n;
	    while(temp!=0){
	        int digit=temp%10;
	        if(digit%2==0)
	        even=true;
	        else
	        odd=true;
	        temp=temp/10;
	   }
	   if(even && odd)
	   System.out.println("It is mixed");
	   else if(even)
	   System.out.println("It is even");
	   else
	   System.out.println("it is odd");
	}
}