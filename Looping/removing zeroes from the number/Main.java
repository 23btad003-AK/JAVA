import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int temp=n;
	    int result=0,place=1;
	    while(temp!=0){
	        int digit=temp%10;
	        if(digit!=0){
	            result=digit*place+result;
	            place=place*10;
	        }
	        temp=temp/10;
	    }
	    System.out.println(result);
	    
}
}