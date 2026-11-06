package ru.beletskiy.part4.objects;
import java.util.Arrays;
/** ПР4.1, задание 5. */
public class Reader {
    private final String fullName, ticketNumber, faculty, dateOfBirth, phone;
    public Reader(String fullName, String ticketNumber, String faculty, String dateOfBirth, String phone) {
        this.fullName = fullName; this.ticketNumber = ticketNumber; this.faculty = faculty;
        this.dateOfBirth = dateOfBirth; this.phone = phone;
    }
    public void takeBook(int count) { System.out.println(fullName + " взял " + count + " книги"); }
    public void takeBook(String... titles) { System.out.println(fullName + " взял книги: " + String.join(", ", titles)); }
    public void takeBook(Book... books) {
        System.out.println(fullName + " взял книги: " + Arrays.toString(books));
    }
    public void returnBook(int count) { System.out.println(fullName + " вернул " + count + " книги"); }
    public void returnBook(String... titles) { System.out.println(fullName + " вернул книги: " + String.join(", ", titles)); }
    public void returnBook(Book... books) { System.out.println(fullName + " вернул книги: " + Arrays.toString(books)); }
    public String getTicketNumber() { return ticketNumber; }
    public String getFaculty() { return faculty; }
    public String getDateOfBirth() { return dateOfBirth; }
    public String getPhone() { return phone; }
}
