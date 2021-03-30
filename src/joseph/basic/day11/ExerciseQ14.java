package joseph.basic.day11;

import java.util.Calendar;

public class ExerciseQ14 {
    public static void main(String[] args) {
        //Q14.
        System.out.print("현재 시간은 : ");
        Calendar time = Calendar.getInstance();
        System.out.print(time.getTime());

        System.out.println();

        time = Calendar.getInstance();
        time.add(Calendar.DATE,(1234567890/86400));
        System.out.println(time.getTime());

        time = Calendar.getInstance();
        time.add(Calendar.HOUR_OF_DAY,(98765/3600));
        System.out.println(time.getTime());

        time = Calendar.getInstance();
        time.add(Calendar.MINUTE,(12345/60));
        System.out.println(time.getTime());

    }

}
