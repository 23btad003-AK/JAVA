import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int temp=n;
	    int min=temp%10;;
	    
	    while(temp!=0){
	    int lastdigit=temp%10;
	    if(lastdigit<min){
	        min=lastdigit;
	    }
	    temp=temp/10;
	   }
	   System.out.println("The Smallest number is "+min);
}
}