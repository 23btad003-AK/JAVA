import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int temp=n;
	    int sum=0;
	    while(n!=0){
	        sum+=n%10;
	        n=n/10;
	    }
	    
	    System.out.printf("SUm of %d : %d ",temp,sum);
		
	}
}
