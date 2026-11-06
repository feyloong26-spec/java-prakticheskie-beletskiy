package ru.beletskiy.tasks.ch01.z06;

/**
 * ПР1 часть 1.pdf — задание 6
 * Часть 1 / Задание 6 — гарм. ряд
 * Запускайте этот класс отдельно, через зелёный треугольник возле main().
 */
public class Main {
    public static void main(String[] args) {
        ru.beletskiy.tasks.TaskInfo.show("01.06", "Часть 1 / Задание 6 — гарм. ряд");
        double sum = 0;
        for (int i = 1; i <= 10; i++) {
            double term = 1.0 / i;
            sum += term;
            System.out.printf("H_%02d: 1/%02d = %.6f; сумма = %.6f%n", i, i, term, sum);
        }
    }
}
