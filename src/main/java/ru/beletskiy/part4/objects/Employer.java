package ru.beletskiy.part4.objects;
/** ПР4.1, задание 6: базовый класс работника. */
public class Employer {
    protected final String firstName, lastName;
    protected final double income;
    public Employer(String firstName, String lastName, double income) {
        this.firstName = firstName; this.lastName = lastName; this.income = income;
    }
    public double getIncome() { return income * 12; } // Годовой оклад (12 месяцев).
    @Override public String toString() { return firstName + " " + lastName; }
}
