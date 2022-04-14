package userService.util;

import lombok.experimental.UtilityClass;

import java.time.LocalDate;
import java.time.LocalTime;

@UtilityClass
public class DateTimeUtil {

    public static final LocalTime FIX_CLOSE_TIME = LocalTime.of(11, 0);
    private static final LocalDate MIN_DATE = LocalDate.of(1, 1, 1);
    private static final LocalDate MAX_DATE = LocalDate.of(3000, 1, 1);

    public static LocalDate startDayOrMin(LocalDate localDate) {
        return localDate != null ? localDate : MIN_DATE;
    }

    public static LocalDate endDayOrMax(LocalDate localDate) {
        return localDate != null ? localDate : MAX_DATE;
    }
}
