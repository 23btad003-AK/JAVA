import java.util.*;
public class New6{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int max=Math.max(a,Math.max(b,c));
        int x,y;
        if(max==a){
            x=b;y=c;
        }
        else if(max==b){
            x=a;y=c;
        }
        else{
            x=a;y=b;
        }
        if((x*x)+(y*y)==max*max){
            System.out.println("It is right angled triangle");
        }
        else{
            System.out.println("It is not a right angled triangle");
        }

        }
}