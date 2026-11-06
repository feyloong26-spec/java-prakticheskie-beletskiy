package ru.beletskiy.tasks.ch041.z01;

/**
 * ПР1 часть 4.pdf — ПР4.1 задание 1
 * ПР4.1 / Задание 1 — фигуры
 * Запускайте этот класс отдельно, через зелёный треугольник возле main().
 */
public class Main {
    public static void main(String[] args) {
        ru.beletskiy.tasks.TaskInfo.show("04.1-01", "ПР4.1 / Задание 1 — фигуры");
        ru.beletskiy.part3.shapes.Shape[] shapes = {
            new ru.beletskiy.part3.shapes.Circle(2),
            new ru.beletskiy.part3.shapes.Rectangle(3, 4),
            new ru.beletskiy.part3.shapes.Square(5)
        };
        for (ru.beletskiy.part3.shapes.Shape s : shapes)
            System.out.printf("%s: площадь %.2f, периметр %.2f%n",s.getType(), s.getArea(), s.getPerimeter());
    }
}
