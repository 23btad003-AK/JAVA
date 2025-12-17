import java.util.*;

public class Party {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tvkcount = 0, dmkcount = 0, admkcount = 0;
        int n;

        while (true) {
            System.out.println("Enter the respective number to cast your vote");
            System.out.println("TVK - 1");
            System.out.println("DMK - 2");
            System.out.println("ADMK - 3");
            System.out.println("End Session - -1");

            n = sc.nextInt();

            if (n == -1) {
                System.out.println("Session ended");
                break;   
            }

            switch (n) {
                case 1:
                    tvkcount++;
                    break;
                case 2:
                    dmkcount++;
                    break;
                case 3:
                    admkcount++;
                    break;
                default:
                    System.out.println("Enter valid number");
            }
        }

        System.out.println("\n------- Election Results -------");

        if (tvkcount > dmkcount && tvkcount > admkcount)
            System.out.println("Winner: TVK\nVotes: " + tvkcount);
        else if (admkcount > tvkcount && admkcount > dmkcount)
            System.out.println("Winner: ADMK\nVotes: " + admkcount);
        else if (dmkcount > tvkcount && dmkcount > admkcount)
            System.out.println("Winner: DMK\nVotes: " + dmkcount);
        else
            System.out.println("It's a TIE");
    }
}
