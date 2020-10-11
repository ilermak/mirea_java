package ex_9;

public class Employee {
    private String firstName, lastName, place;
    private int number;
    private Dates dates;

    public Employee(String firstName, String secondName, String place, int number, Dates dates) {
        this.firstName = firstName;
        this.lastName = secondName;
        this.place = place;
        this.number = number;
        this.dates = dates;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return firstName +
                " " + lastName +
                "," + place +
                "," + number +
                ", " + dates;
    }
}