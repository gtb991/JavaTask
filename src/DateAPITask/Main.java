package DateAPITask;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Main {
    public static int getDayOfWeek() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1977, Calendar.MAY, 25);
        DayOfWeek dayOfWeek = LocalDate.parse("1977-05-25").getDayOfWeek();
        return calendar.get(Calendar.DAY_OF_WEEK);
    }

    public static int numbersOfPlay() {

        Calendar start = Calendar.getInstance();
        start.set(1977, Calendar.MAY, 25);
        Calendar end = Calendar.getInstance();
        end.set(1979, Calendar.MAY, 25);

        int numOfPlay = 0;
        int monday = Calendar.MONDAY;
        while (start.before(end)) {

            if (start.get(Calendar.DAY_OF_WEEK) == monday) {
                numOfPlay++;
                start.add(Calendar.DATE, 7);
            } else {

                start.add(Calendar.DATE, 1);
            }
        }
        if (getDayOfWeek() != (1 & 7)) {
            numOfPlay++;
        }
        return numOfPlay;

    }

    public static void main(String[] args) {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime nowFlight = LocalTime.parse("11:15").minusHours(6);
        System.out.println("What is the duration of the flight? Duration of flight is:  " + dateTimeFormatter.format(nowFlight));

//        Task 2 What day of the week was it released?
        DayOfWeek dayOfWeek = LocalDate.parse("1977-05-25").getDayOfWeek();
        System.out.println("What day of the week was it released? Day of release is:  " + dayOfWeek);
        System.out.println(getDayOfWeek());

//        How many times was it played in the first 2 years?
        System.out.println("How many times was it played in the first 2 years? Was played: " + numbersOfPlay());

//        How many TOTAL minutes/hours/days of playtime it summed up in the 1st year?
        int totalMinutes = ((numbersOfPlay() / 2) + 1) * 120;
        System.out.println("How many TOTAL minutes of playtime it summed up in the 1st year? " + totalMinutes);

        int totalHours = totalMinutes / 60;
        System.out.println("How many TOTAL hours of playtime it summed up in the 1st year? " + totalHours);

        int totalDays = totalHours / 24;
        System.out.println("How many TOTAL days of playtime it summed up in the 1st year? " + totalDays);


    }
}
