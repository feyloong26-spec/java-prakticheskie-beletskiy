package ru.beletskiy.tasks.ch041.z03;

/**
 * ПР1 часть 4.pdf — ПР4.1 задание 3
 * ПР4.1 / Задание 3 — Person
 * Запускайте этот класс отдельно, через зелёный треугольник возле main().
 */
public class Main {
    public static void main(String[] args) {
        ru.beletskiy.tasks.TaskInfo.show("04.1-03", "ПР4.1 / Задание 3 — Person");
        ru.beletskiy.part4.objects.Person[] people = {
            new ru.beletskiy.part4.objects.Person(),
            new ru.beletskiy.part4.objects.Person("Алексей Белецкий", 20)
        };
        for (ru.beletskiy.part4.objects.Person person : people) {
            System.out.println(person); person.talk(); person.move();
        }
    }
}
