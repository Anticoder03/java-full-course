package test27;

import java.time.LocalDate;
import java.time.Period;

public class CalculateAge {
    public static void main(String[] args) {

        LocalDate birthDate = LocalDate.of(1995, 5, 15);
        LocalDate today = LocalDate.now();

        Period age = Period.between(birthDate, today);

        System.out.println("Age: " + age.getYears() + " years");
    }
}