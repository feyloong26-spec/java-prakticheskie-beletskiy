package ru.beletskiy.additional.errors;
public class TestA {
    public static void main(String[] args) {
        // В исходном примере new A() вызывал несуществующий конструктор.
        A a = new A("Исправленная программа A");
        a.print(); System.out.println();
    }
}
