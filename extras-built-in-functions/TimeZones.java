import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZones {
    public static void main(String[] args) {
        ZoneId zidIST = ZoneId.of("GMT+05:30");
        ZonedDateTime indiaTime = ZonedDateTime.now(zidIST);
        System.out.println("IST (Indian Standard Time): " + indiaTime);
        ZoneId zidGMT = ZoneId.of("GMT+00:00");
        ZonedDateTime gmtTime = ZonedDateTime.now(zidGMT);
        System.out.println("GMT (Green Meridian Time): " + gmtTime);
        ZoneId zidPST = ZoneId.of("GMT-07:00");
        ZonedDateTime pstTime = ZonedDateTime.now(zidPST);
        System.out.println("GMT (Green Meridian Time): " + pstTime);
    }
}
