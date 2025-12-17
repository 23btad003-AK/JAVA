import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int temp=n;
	    int sqsum=0,cubesum=0;
	    while(temp!=0){
	        int digit=temp%10;
	        sqsum+=digit*digit;
	        cubesum+=digit*digit*digit;
	        temp=temp/10;
	    }
	    int result=sqsum+cubesum;
	    System.out.println(result);
	    
}
}