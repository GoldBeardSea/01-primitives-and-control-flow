import java.time.LocalDateTime;

public class CommandLineClock {
    public static void main(String[] args) {
        while (true) {
            LocalDateTime now = LocalDateTime.now();
            int hour = now.getHour();
            int minute = now.getMinute();
            int second = now.getSecond();

            String format = "%02d:%02d:%02d";
            String timeOut = String.format(format, hour, minute, second);
            System.out.println(timeOut);
            try {
                Thread.sleep(1000);
            }catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }

    }
}