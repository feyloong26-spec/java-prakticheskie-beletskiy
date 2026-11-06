package ru.beletskiy.part1;
import java.util.Arrays;
import java.util.Scanner;

/** ПР1, часть 1: задания 3–7. */
public class Part1Demo {
    public static void main(String[] args) { run(new Scanner(System.in), args); }
    public static void run(Scanner sc, String[] args) {
        System.out.println("\n=== Задание 3. Массив, for ===");
        int[] given = {3, 6, 9, 12, 15};
        int sum = 0;
        for (int i = 0; i < given.length; i++) sum += given[i];
        System.out.println("Массив: " + Arrays.toString(given));
        System.out.printf("Сумма = %d, среднее = %.2f%n", sum, (double) sum / given.length);
        System.out.println("\n=== Задание 4. Клавиатура, do while и while ===");
        System.out.print("Сколько целых чисел ввести? (1–100): ");
        if (!sc.hasNextInt()) { System.out.println("Неверный ввод."); return; }
        int n = sc.nextInt();
        if (n < 1 || n > 100) { System.out.println("Количество должно быть от 1 до 100."); return; }
        int[] values = new int[n];
        int i = 0;
        do {
            System.out.print("Число " + (i + 1) + ": ");
            if (!sc.hasNextInt()) { System.out.println("Неверный ввод."); return; }
            values[i++] = sc.nextInt();
        } while (i < n);
        int total = 0, min = values[0], max = values[0];
        i = 0;
        while (i < values.length) {
            total += values[i];
            if (values[i] < min) min = values[i];
            if (values[i] > max) max = values[i];
            i++;
        }
        System.out.printf("Сумма: %d; минимум: %d; максимум: %d%n", total, min, max);
        System.out.println("\n=== Задание 5. Аргументы командной строки ===");
        if (args.length == 0) System.out.println("Аргументы не заданы (Run → Edit Configurations → Program arguments).");
        for (int j = 0; j < args.length; j++) System.out.println(j + ": " + args[j]);
        System.out.println("\n=== Задание 6. Первые 10 членов гармонического ряда ===");
        double harmonic = 0;
        for (int k = 1; k <= 10; k++) {
            harmonic += 1.0 / k;
            System.out.printf("H_%02d: 1/%02d = %.6f; сумма = %.6f%n", k, k, 1.0 / k, harmonic);
        }
        System.out.println("\n=== Задание 7. Факториал методом класса ===");
        System.out.println("5! = " + factorial(5));
    }
    public static long factorial(int n) {
        if (n < 0 || n > 20) throw new IllegalArgumentException("Только 0..20 (тип long)");
        long result = 1;
        for (int i = 2; i <= n; i++) result *= i;
        return result;
    }
}
