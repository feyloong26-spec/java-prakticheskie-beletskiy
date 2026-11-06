package ru.beletskiy.part4.objects;
/** ПР4.1, задание 3. */
public class Person {
    private String fullName;
    private int age;
    public Person() { this("Без имени", 0); }
    public Person(String fullName, int age) { this.fullName = fullName; this.age = age; }
    public void move() { System.out.println(fullName + " идет"); }
    public void talk() { System.out.println(fullName + " говорит"); }
    @Override public String toString() { return fullName + " (" + age + " лет)"; }
}
