import org.jetbrains.annotations.Nullable;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class hundredDaysFromNow {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now(ZoneId.of("Europe/London"));

        calculateDaysFromNow(today);
        System.out.println();
        calculateMonthsFromNow(today);
        System.out.println();
        calculateYearsFromNow(today);
    }

    static LocalDate calculateDaysFromNow(LocalDate today){
        Period hundredDays = Period.ofDays(100);
        today = today.plus(hundredDays);
        String formattedDate = today
                .format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println("100 days from now is "+formattedDate);
        return null;

    }static LocalDate calculateMonthsFromNow(LocalDate today){
        Period numMonths = Period.ofMonths(6);
        today = today.plus(numMonths);
        String formattedDate = today
                .format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println("6 months from now is "+formattedDate);
        return null;
    }

    static LocalDate calculateYearsFromNow(LocalDate today){
        Period oneYear = Period.ofYears(10);
        today = today.plus(oneYear);
        String formattedDate = today
                .format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println("10 years from now is "+formattedDate);
        return null;

    }
}
