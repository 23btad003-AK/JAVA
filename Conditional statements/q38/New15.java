import java.util.*;
public class New15{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         int marks = sc.nextInt();
        int grade;

        if(marks >= 90 && marks <= 100)
            grade = 1;   
        else if(marks >= 75 && marks < 90)
            grade = 2;   
        else if(marks >= 50 && marks < 75)
            grade = 3;   
        else if(marks >= 0 && marks < 50)
            grade = 4;   
        else 
            grade = 0;   

        switch(grade){
            case 1:
                System.out.println("Grade A");
                break;
            case 2:
                System.out.println("Grade B");
                break;
            case 3:
                System.out.println("Grade C");
                break;
            case 4:
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid Marks");
        }
    }
}