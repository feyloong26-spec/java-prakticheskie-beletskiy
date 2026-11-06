package ru.beletskiy.part2;
/** ПР1 часть 2, UML: автор книги. */
public class Author {
    private final String name;
    private String email;
    private final char gender;
    public Author(String name, String email, char gender) {
        if (gender != 'M' && gender != 'F' && gender != 'U')
            throw new IllegalArgumentException("Пол: M, F или U");
        this.name = name; this.email = email; this.gender = gender;
    }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public char getGender() { return gender; }
    @Override public String toString() { return name + " (" + Character.toLowerCase(gender) + ") at " + email; }
}
