import java.util.*;
public class Todo17{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       boolean ispowerof2= (n>0) && ((n&(n-1))==0);
       System.out.println("Is it a power of 2: "+ispowerof2);
}
}