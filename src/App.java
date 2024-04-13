import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        //String day = "Friday";
        // get the day of the week  and print the day   

        String day = dayOfWeek();


        switch(day) {
            case "Monday":
                System.out.println("Today is Monday");
                break;
            case "Tuesday":
                System.out.println("Today is Tuesday");
                break;
            case "Wednesday":
                System.out.println("Today is Wednesday");
                break;
            case "Thursday":
                System.out.println("Today is Thursday");
                break;
            case "Friday":
                System.out.println("Today is Friday");
                break;
            case "Saturday":
                System.out.println("Today is Saturday");
                break;
            case "Sunday":
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }

    public static String dayOfWeek() {
        LocalDate date = LocalDate.now();
        return date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault());
    }

}
