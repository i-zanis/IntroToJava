import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class E11_06 {
    public static void main(String[] args) {
ArrayList<Object> list = new ArrayList<>();
list.add("ABC");
list.add(new Date());
list.add(new GregorianCalendar());

        for (Object o : list) System.out.println(o);
    }

    }
