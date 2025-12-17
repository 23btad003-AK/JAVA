import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    for(int i=1;i<=n;i++){
	    int temp=i;
	    int sum=0;
	    int rev=0;
	    while(temp!=0){
	        int a=temp%10;
	        sum+=a;
	        temp=temp/10;
	    }
	    int temp1=sum;
	    while(sum!=0){
	        int digit=sum%10;
	        rev=(rev*10)+digit;
	        sum=sum/10;
	    }
	    int multiply=temp1*rev;
	    if(i==multiply){
	        System.out.println(i);
	    }
	    }
	}
}
