import java.util.Calendar;
import java.util.GregorianCalendar;

<<<<<<< HEAD
class MyCalendar extends GregorianCalendar {

    public MyCalendar(int year, int month, int dayOfMonth) {
        super(year, month, dayOfMonth);

    }

    /**return month name in English*/
    public String getMonthName() {
        return getMonthName(get(MONTH));
    }

    public static String getMonthName(int month) {
        String monthName = null;

        switch (month) {
            case 0: monthName = "January"; break;
            case 1: monthName = "February"; break;
            case 2: monthName = "March"; break;
            case 3: monthName = "April"; break;
            case 4: monthName = "May"; break;
            case 5: monthName = "June"; break;
            case 6: monthName = "July"; break;
            case 7: monthName = "August"; break;
            case 8: monthName = "September"; break;
            case 9: monthName = "October"; break;
            case 10: monthName = "November"; break;
            case 11: monthName = "December"; break;
            default:
        }

        return monthName;
    }

    public static String getDayOfWeekName(int day) {
        String dayOfWeekName = null;

        day = day % 7;

        switch (day) {
            case 0: dayOfWeekName = "Sunday"; break;
            case 1: dayOfWeekName = "Monday"; break;
            case 2: dayOfWeekName = "Tuesday"; break;
            case 3: dayOfWeekName = "Wednesday"; break;
            case 4: dayOfWeekName = "Thursday"; break;
            case 5: dayOfWeekName = "Friday"; break;
            case 6: dayOfWeekName = "Saturday"; break;
            default:
        }

        return dayOfWeekName;
    }

    /**Find the number of days in a month*/
    public int daysInMonth() {
        switch (get(MONTH)) {
            case 0:
            case 2:
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
                return 31;
            case 1:
                if (isLeapYear(get(YEAR))) return 29;
                else return 28;
            case 3:
            case 5:
            case 8:
            case 10:
                return 30;
            default: return 0;
        }
    }

    /**Find the number of days in a month*/
    public static int daysInMonth(int month, int year) {
        return new MyCalendar(year, month, 1).daysInMonth();
    }

    /** Get the start day of month/1/year */
    public int getStartDay() {

        int month = get(MONTH) + 1;
        int day = 1;
        int year = get(YEAR);

        if (month == 1) {
            month = 13;
            year--;
        } else if (month == 2) {
            month = 14;
            year--;
        }

        int k = year % 100;
        int j = year / 100;
        return ((day + 26 * (month + 1) / 10 + k + k / 4 + j / 4 + 5 * j) - 1) % 7;
    }


}

class E13_04 {

    private static MyCalendar calendar;
    /** Main method */
    public static void main(String[] args) {

        if (args.length > 2 || args.length == 0) {
            System.out.println("Invalid arguments");
            System.out.println("Usage: java Exercise13_04 5 2016");
            System.exit(1);
        }

        int year;
        if (args.length == 1) {
            year = Calendar.getInstance().get(Calendar.YEAR);
        } else {
            year = new Integer(args[1]);
        }
        int month = Integer.parseInt(args[0]) - 1;
        calendar = new MyCalendar(year, month, 1);
        calendar.set(Calendar.DATE, 1);

        printMonth();
    }

    /** Print the calendar for a month in a year */
    public static void printMonth() {
        // Print the headings of the calendar
        printMonthTitle();

        // Print the body of the calendar
        printMonthBody();
    }

    /** Print the month title, e.g., May, 1999 */
    public static void printMonthTitle() {
        System.out.println("         " + calendar.getMonthName()
                + " " + calendar.get(Calendar.YEAR));
        System.out.println("-----------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }


    /** Print month body */
    public static void printMonthBody() {
        // Get start day of the week for the first date in the month
        int startDay = calendar.get(Calendar.DAY_OF_WEEK) - 1;

        // Get number of days in the month
        int numberOfDaysInMonth = calendar.daysInMonth();

        // Pad space before the first day of the month
        int i = 0;
        for (i = 0; i < startDay; i++)
            System.out.print("    ");

        for (i = 1; i <= numberOfDaysInMonth; i++) {
            System.out.printf("%4d", i);

            if ((i + startDay) % 7 == 0)
                System.out.println();
        }

        System.out.println();
    }


}
=======
public class E12_04 {
    public static void main(String[] args) {
        Calendar cal = new GregorianCalendar();
        System.out.println(cal.get(Calendar.MONTH));
        cal.set(1989, 5, 1);
        for (int i = 0; i < 5; i++) {
            System.out.println(cal.get(Calendar.DAY_OF_WEEK));
        }
        }
    }
>>>>>>> origin/master
