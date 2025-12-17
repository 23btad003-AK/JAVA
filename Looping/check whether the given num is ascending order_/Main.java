import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean isascending=true;
		
		if(n<10){
		    System.out.println("ascending order");
		    return;
		}
		int lastdigit=n%10;
		n=n/10;
		
		while(n>0){
		    int currentdigit=n%10;
		    if(currentdigit<lastdigit){
		        isascending=false;
		        break;
		      }
		      lastdigit=currentdigit;
		      n=n/10;
		}
		if(isascending){
		    System.out.println("The given num is in descending order");
		}
		else{
		    System.out.println("it is not in descnding order");
		}
	}
}
