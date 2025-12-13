import java.util.*;
public class New14{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        char c=sc.next().charAt(0);
        switch(c){
            case '+':
                System.out.printf("Addition:"+(a+b));
                break;
            case '-':
                 System.out.printf("subraction:"+(a-b));
                break;
            case '*':
                 System.out.printf("multiplication:"+(a*b));
                break;
            case '/':
                 System.out.printf("division:"+(a/b));
                break;
            case '%':
                 System.out.printf("Modulus:"+(a%b));
                break;
                default:
                System.out.printf("Enter valid operator:");
            }
        }
}