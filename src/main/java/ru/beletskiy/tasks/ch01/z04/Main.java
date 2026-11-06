package ru.beletskiy.tasks.ch01.z04;

/**
 * ПР1 часть 1.pdf — задание 4
 * Часть 1 / Задание 4 — ввод и циклы
 * Запускайте этот класс отдельно, через зелёный треугольник возле main().
 */
public class Main {
    public static void main(String[] args) {
        ru.beletskiy.tasks.TaskInfo.show("01.04", "Часть 1 / Задание 4 — ввод и циклы");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Сколько целых чисел ввести? (1–100): ");
        if (!sc.hasNextInt()) { System.out.println("Ошибка: введите целое число."); return; }
        int n = sc.nextInt();
        if (n < 1 || n > 100) { System.out.println("Допустимо от 1 до 100."); return; }
        int[] values = new int[n];
        int i = 0;
        do {
            System.out.print("Введите элемент " + (i + 1) + ": ");
            if (!sc.hasNextInt()) { System.out.println("Нужны только целые числа."); return; }
            values[i++] = sc.nextInt();
        } while (i < n);
        int sum = 0, min = values[0], max = values[0];
        i = 0;
        while (i < values.length) {
            int value = values[i++];
            sum += value;
            if (value < min) min = value;
            if (value > max) max = value;
        }
        System.out.println("Введённый массив: " + java.util.Arrays.toString(values));
        System.out.println("Сумма = " + sum + ", минимум = " + min + ", максимум = " + max);
    }
}
