import java.util.Scanner;

public class New21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rate = sc.nextInt();
        int discount;

        if (rate <= 100) {
            discount = 10;
        } 
        else if (rate <= 1000) {
            discount = 20;
        } 
        else if (rate <= 2000) {
            discount = 30;
        } 
        else if (rate <= 3000) {
            discount = 40;
        } 
        else {
            discount = 50;
        }

        System.out.printf("%d is your amount and %d%% is your discount", rate, discount);
        sc.close();
    }
}
