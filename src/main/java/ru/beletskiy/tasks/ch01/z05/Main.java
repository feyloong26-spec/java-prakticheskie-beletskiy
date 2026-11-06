package ru.beletskiy.tasks.ch01.z05;

/**
 * ПР1 часть 1.pdf — задание 5
 * Часть 1 / Задание 5 — аргументы
 * Запускайте этот класс отдельно, через зелёный треугольник возле main().
 */
public class Main {
    public static void main(String[] args) {
        ru.beletskiy.tasks.TaskInfo.show("01.05", "Часть 1 / Задание 5 — аргументы");
        System.out.println("Количество аргументов: " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] = " + args[i]);
        }
        if (args.length == 0) System.out.println("Задайте Program arguments в конфигурации запуска.");
    }
}
