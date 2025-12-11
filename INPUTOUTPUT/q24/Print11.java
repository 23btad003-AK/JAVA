import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Print11 {
    public static void main(String[] args) {

        LocalTime time = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        String currentTime = time.format(formatter);
        System.out.println("Current Time: " + currentTime);
    }
}
