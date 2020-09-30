import java.util.Calendar;
import java.util.GregorianCalendar;

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
