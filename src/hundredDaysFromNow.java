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

    public static void calculateDaysFromNow(LocalDate today){
        Period hundredDays = Period.ofDays(100);
        today = today.plus(hundredDays);
        String mediumDate = today
                .format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        String fullDate = today
                .format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        String shortDate = today
                .format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        String longDate = today
                .format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));

        System.out.println("100 days from now is "+mediumDate);
        System.out.println("100 days from now is "+fullDate);
        System.out.println("100 days from now is "+shortDate);
        System.out.println("100 days from now is "+longDate);

    }
    public static void calculateMonthsFromNow(LocalDate today){
        Period numMonths = Period.ofMonths(6);
        today = today.plus(numMonths);
        String formattedDate = today
                .format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println("6 months from now is "+formattedDate);
        formattedDate = today
                .format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println("6 months from now is "+formattedDate);
        formattedDate = today
                .format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println("6 months from now is "+formattedDate);
        formattedDate = today
                .format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        System.out.println("6 months from now is "+formattedDate);
    }

    public static void calculateYearsFromNow(LocalDate today){
        Period oneYear = Period.ofYears(10);
        today = today.plus(oneYear);
        String formattedDate = today
                .format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println("10 years from now is "+formattedDate);
        formattedDate = today
                .format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println("10 years from now is "+formattedDate);
        formattedDate = today
                .format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println("10 years from now is "+formattedDate);
        formattedDate = today
                .format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        System.out.println("10 years from now is "+formattedDate);
    }
}
