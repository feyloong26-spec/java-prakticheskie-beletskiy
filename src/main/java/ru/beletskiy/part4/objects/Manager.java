package ru.beletskiy.part4.objects;
/** Менеджер получает оклад и дополнительные выплаты от продаж. */
public class Manager extends Employer {
    private final double averageSum;
    public Manager(String firstName, String lastName, double income, double averageSum) {
        super(firstName, lastName, income); this.averageSum = averageSum;
    }
    @Override public double getIncome() { return super.getIncome() + averageSum; }
}
