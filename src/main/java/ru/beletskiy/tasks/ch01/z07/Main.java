package ru.beletskiy.tasks.ch01.z07;

/**
 * ПР1 часть 1.pdf — задание 7
 * Часть 1 / Задание 7 — факториал
 * Запускайте этот класс отдельно, через зелёный треугольник возле main().
 */
public class Main {
    public static void main(String[] args) {
        ru.beletskiy.tasks.TaskInfo.show("01.07", "Часть 1 / Задание 7 — факториал");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Введите n для вычисления n! (0..20): ");
        if (!sc.hasNextInt()) { System.out.println("Введите целое число."); return; }
        int n = sc.nextInt();
        if (n < 0 || n > 20) { System.out.println("Для типа long допустимо 0..20."); return; }
        System.out.println(n + "! = " + ru.beletskiy.part1.Part1Demo.factorial(n));
    }
}
