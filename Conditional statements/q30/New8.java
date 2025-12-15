import java.util.*;
public class New8{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int sum=x+y+z;
        if((x>0 && y>0 && z>0)&& (sum==180)){
            System.out.println("It is valid triangle");
        }
        else{
            System.out.println("It is not a valid trIANGLE");
        }

        }
}