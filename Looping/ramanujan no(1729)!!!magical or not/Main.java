
public class Main
{
	public static void main(String[] args) {
	    //Scanner sc=new Scanner(System.in);
	    int n=1729;
	    int temp=n;
	    int sum=0;
	    int rev=0;
	    while(n!=0){
	        int a=n%10;
	        sum+=a;
	        n=n/10;
	    }
	    int temp1=sum;
	    while(sum!=0){
	        int digit=sum%10;
	        rev=(rev*10)+digit;
	        sum=sum/10;
	    }
	    int multiply=temp1*rev;
	    if(temp==multiply){
	        System.out.println("It is magic no");
	    }
	    else{
	        System.out.println("It is not a magic no");
	    }
	}
}
