package ex_9;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dates {
    LocalDate ld;
    DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public Dates(int day, int month, int year) {
        ld = LocalDate.of(year, month, day);
    }

    @Override
    public String toString() {
        return f.format(ld);
    }
}
