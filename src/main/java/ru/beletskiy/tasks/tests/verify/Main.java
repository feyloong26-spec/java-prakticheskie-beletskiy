package ru.beletskiy.tasks.tests.verify;

/**
 * Внутренняя проверка решений
 * ПРОВЕРКА — автоматические тесты
 * Запускайте этот класс отдельно, через зелёный треугольник возле main().
 */
public class Main {
    public static void main(String[] args) {
        ru.beletskiy.tasks.TaskInfo.show("99.00", "ПРОВЕРКА — автоматические тесты");
        ru.beletskiy.Verification.main(args);
    }
}
