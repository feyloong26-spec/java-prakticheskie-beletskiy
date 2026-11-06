package ru.beletskiy.tasks.extra.err1;

/**
 * ООАиП_Практическая_работа_1_дополнительные_задания.pdf — упражнение 1
 * Доп. / Упр. 1 — ошибка конструктора
 * Запускайте этот класс отдельно, через зелёный треугольник возле main().
 */
public class Main {
    public static void main(String[] args) {
        ru.beletskiy.tasks.TaskInfo.show("05.01", "Доп. / Упр. 1 — ошибка конструктора");
        System.out.println("В исходном примере new A() вызывает ошибку компиляции:");
        System.out.println("в классе A объявлен только конструктор A(String), без A().");
        System.out.println("Исправленный вариант:");
        ru.beletskiy.additional.errors.TestA.main(args);
    }
}
