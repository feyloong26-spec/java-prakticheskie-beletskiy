package ru.beletskiy.tasks.ch03.z02;

/**
 * ПР1 часть 3.pdf — задание 2
 * Часть 3 / Задание 2 — Movable
 * Запускайте этот класс отдельно, через зелёный треугольник возле main().
 */
public class Main {
    public static void main(String[] args) {
        ru.beletskiy.tasks.TaskInfo.show("03.02", "Часть 3 / Задание 2 — Movable");
        ru.beletskiy.part3.movable.MovablePoint p = new ru.beletskiy.part3.movable.MovablePoint(3, 4, 2, 1);
        System.out.println("Исходная точка: " + p);
        p.moveRight(); p.moveUp();
        System.out.println("После moveRight() и moveUp(): " + p);
        ru.beletskiy.part3.movable.MovableCircle c = new ru.beletskiy.part3.movable.MovableCircle(10, 10, 3, 2, 5);
        System.out.println("Исходный круг: " + c);
        c.moveLeft();
        System.out.println("После moveLeft(): " + c);
    }
}
