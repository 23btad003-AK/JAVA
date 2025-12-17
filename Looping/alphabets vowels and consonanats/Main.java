import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        for(char i='A';i<='Z';i++){
            if(i=='A'||i=='E'||i=='I'||i=='O'||i=='U')
            System.out.println("Vowels: "+i);
        }
        for(char i='A';i<='Z';i++){
            if(i!='A'&& i!='E'&& i!='I'&& i!='O'&& i!='U')
            System.out.println("Consonants: "+i);
        }
        
    }
}