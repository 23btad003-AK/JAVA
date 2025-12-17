import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    int x=a,y=b;
	    while(y!=0){
	    if(x>y)
	    x=x-y;
	    else
	    y=y-x;
	    }
	    int gcd=x;
	    int lcm=a*b/gcd;
	    
	    System.out.printf("GCD of %d and %d is : %d",a,b,gcd);
			    System.out.printf("LCM of %d and %d is : %d",a,b,lcm);

	}
}
