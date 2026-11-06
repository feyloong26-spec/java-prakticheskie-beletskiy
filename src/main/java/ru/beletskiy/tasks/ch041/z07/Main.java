package ru.beletskiy.tasks.ch041.z07;

/**
 * ПР1 часть 4.pdf — ПР4.1 задание 7
 * ПР4.1 / Задание 7 — учащиеся
 * Запускайте этот класс отдельно, через зелёный треугольник возле main().
 */
public class Main {
    public static void main(String[] args) {
        ru.beletskiy.tasks.TaskInfo.show("04.1-07", "ПР4.1 / Задание 7 — учащиеся");
        ru.beletskiy.part4.objects.Learner[] learners = {
            new ru.beletskiy.part4.objects.Schoolchild("Павел"),
            new ru.beletskiy.part4.objects.Student("Мария"),
            new ru.beletskiy.part4.objects.Schoolchild("Олег"),
            new ru.beletskiy.part4.objects.Student("Антон")
        };
        System.out.println("Школьники:");
        for (ru.beletskiy.part4.objects.Learner l : learners)
            if (l instanceof ru.beletskiy.part4.objects.Schoolchild) System.out.println("  " + l);
        System.out.println("Студенты:");
        for (ru.beletskiy.part4.objects.Learner l : learners)
            if (l instanceof ru.beletskiy.part4.objects.Student) System.out.println("  " + l);
    }
}
