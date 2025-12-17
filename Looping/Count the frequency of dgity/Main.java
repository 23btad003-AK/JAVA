import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int[] freq=new int[10];
	    while(n!=0){
	        int digit=n%10;
	        freq[digit]++;
	        n=n/10;
	    }
	    for(int i=0;i<=9;i++){
		        if(freq[i]>0)
		        System.out.printf("count of %d is %d\n ",i,freq[i]);
		        
		    }
		}
}