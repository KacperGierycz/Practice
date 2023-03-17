package interfaces;

import java.time.ZonedDateTime;

public interface AbstractZoneTimeClient extends TimeClient {
    public ZonedDateTime getZonedDateTime(String zoneString);
}
