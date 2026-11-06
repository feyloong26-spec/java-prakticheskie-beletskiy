package ru.beletskiy.tasks.ch041.z06;

/**
 * ПР1 часть 4.pdf — ПР4.1 задание 6
 * ПР4.1 / Задание 6 — Employer
 * Запускайте этот класс отдельно, через зелёный треугольник возле main().
 */
public class Main {
    public static void main(String[] args) {
        ru.beletskiy.tasks.TaskInfo.show("04.1-06", "ПР4.1 / Задание 6 — Employer");
        ru.beletskiy.part4.objects.Employer[] employers = {
            new ru.beletskiy.part4.objects.Employer("Иван", "Петров", 50000),
            new ru.beletskiy.part4.objects.Manager("Мария", "Иванова", 65000, 150000)
        };
        for (ru.beletskiy.part4.objects.Employer e : employers)
            System.out.printf("%s: годовой доход %.2f руб.%n", e, e.getIncome());
    }
}
