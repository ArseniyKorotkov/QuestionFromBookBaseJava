package course1.Qwestions.VariableA;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Question6
{
    public void task()
    {
        System.out.println("Korotkow Arseniy");
        System.out.println("Date receiving a task is: 12.12.2020");
        GregorianCalendar calendar = new GregorianCalendar();

        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH) + 1;
        int year = calendar.get(Calendar.YEAR);

        System.out.println("Date passage a task is: " + dayOfMonth + "." + month + "." + year);

    }
}
