import java.util.*;
public class New3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        if(c>='0' && c<='9'){
            System.out.println("digit");
        }
        else{
            System.out.println("not alphabet");
        }
    }
}