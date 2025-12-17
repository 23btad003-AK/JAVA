import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int evensum=0,oddsum=0;
	    int temp=n;
	    while(temp!=0){
	        int digit=temp%10;
	        if(digit%2==0)
	        evensum+=digit;
	        else
	        oddsum+=digit;
	        temp=temp/10;
	   }
	   int diff=evensum-oddsum;
	   System.out.println(diff);
}
}