package ru.beletskiy.tasks.ch01.z03;

/**
 * ПР1 часть 1.pdf — задание 3
 * Часть 1 / Задание 3 — массив for
 * Запускайте этот класс отдельно, через зелёный треугольник возле main().
 */
public class Main {
    public static void main(String[] args) {
        ru.beletskiy.tasks.TaskInfo.show("01.03", "Часть 1 / Задание 3 — массив for");
        int[] numbers = {3, 6, 9, 12, 15};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) sum += numbers[i];
        System.out.println("Массив: " + java.util.Arrays.toString(numbers));
        System.out.println("Сумма = " + sum);
        System.out.printf("Среднее арифметическое = %.2f%n", (double) sum / numbers.length);
    }
}
