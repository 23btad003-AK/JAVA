import java.util.*;
public class New2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        if(c>='a' && c<='z'){
            System.out.println("lowercase");
        }
        else if(c>='A' && c<='Z'){
            System.out.println("Uppercase");
        }
        else if(c>='0' && c<='9'){
            System.out.println("Numbers");
        }
        else{
            System.out.println("Symbols");
        }
        
    }
}