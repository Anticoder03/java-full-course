package test27;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DateTimeDemo {

    public static void main(String[] args) {

     
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date: " + currentDate);


        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time: " + currentTime);

  
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + currentDateTime);

   
        LocalDate date1 = LocalDate.of(2023, 1, 1);
        LocalDate date2 = LocalDate.of(2023, 12, 31);

    
        long days = ChronoUnit.DAYS.between(date1, date2);

        System.out.println("\nInput Dates:");
        System.out.println("Date 1: " + date1);
        System.out.println("Date 2: " + date2);
        System.out.println("Days Between: " + days + " days");
    }
}