package ru.beletskiy.tasks.ch041.z08;

/**
 * ПР1 часть 4.pdf — ПР4.1 задание 8
 * ПР4.1 / Задание 8 — abstract Shape
 * Запускайте этот класс отдельно, через зелёный треугольник возле main().
 */
public class Main {
    public static void main(String[] args) {
        ru.beletskiy.tasks.TaskInfo.show("04.1-08", "ПР4.1 / Задание 8 — abstract Shape");
        ru.beletskiy.part3.shapes.TestShape.main(args);
        System.out.println("Абстрактный Shape нельзя создать через new Shape().");
        System.out.println("Методы getArea()/getPerimeter() переопределяются в наследниках.");
    }
}
