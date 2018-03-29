package time_zone_determinant;

import java.time.ZoneId;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class TimeZoneDeterminant {

    private String timeZone;

    public int getHoursFrom(String timeZone) {
        Calendar calendar = new GregorianCalendar(TimeZone.getTimeZone(timeZone));
        return calendar.get(Calendar.HOUR_OF_DAY);
    }

    public String getTimeZoneBy(String city) {
        for (String zone : ZoneId.getAvailableZoneIds()) {
            if (zone.contains(city)) {
                timeZone = zone;
                break;
            }
        }
        return timeZone;
    }
}
