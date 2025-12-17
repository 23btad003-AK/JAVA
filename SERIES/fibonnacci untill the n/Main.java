import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 int n = sc.nextInt();
		 int a = 0, b = 1;
    for (int i = 1; a <= n; i++) {
            if (a >= 1) {
                System.out.print(a + " ");
            }
            int next = a + b;
            a = b;
            b = next;
        }
	}
}
