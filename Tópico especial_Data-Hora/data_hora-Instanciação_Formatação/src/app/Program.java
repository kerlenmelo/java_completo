package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {

        //https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/format/DateTimeFormatter.html
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();
        
        LocalDate d04 = LocalDate.parse("2024-01-22");
        LocalDateTime d05 = LocalDateTime.parse("2024-01-22T03:33:30");
        Instant d06 = Instant.parse("2024-01-22T15:50:30Z");
        Instant d07 = Instant.parse("2024-01-22T15:50:30-03:00");

        LocalDate d08 = LocalDate.parse("22/01/2024", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("22/01/2024 16:00", fmt2);

        LocalDate d10 = LocalDate.of(2024,01,22);
        LocalDateTime d11 = LocalDateTime.of(2024, 01, 22, 16, 00);

        System.out.println("Instaciação:");
        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);
        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
        System.out.println("d06 = " + d06);
        System.out.println("d07 = " + d07);
        System.out.println("d08 = " + d08);
        System.out.println("d09 = " + d09);
        System.out.println("d10 = " + d10);
        System.out.println("d11 = " + d11);

        LocalDate d12 = LocalDate.parse("2024-01-22");
        LocalDateTime d13 = LocalDateTime.parse("2024-01-22T03:33:30");
        Instant d14 = Instant.parse("2024-01-22T15:50:30Z");
        
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt5 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        System.out.println("\nFormatação:");
        System.out.println("d12 = " + d12.format(fmt3));
        System.out.println("d12 = " + fmt3.format(d12));
        System.out.println("d12 = " + d12.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        
        System.out.println("d13 = " + d13.format(fmt3));
        System.out.println("d13 = " + d13.format(fmt4));

        System.out.println("d14 = " + fmt5.format(d14));
    }
}
