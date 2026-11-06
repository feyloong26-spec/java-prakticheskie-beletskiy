package ru.beletskiy.tasks.ch041.z02;

/**
 * ПР1 часть 4.pdf — ПР4.1 задание 2
 * ПР4.1 / Задание 2 — Phone
 * Запускайте этот класс отдельно, через зелёный треугольник возле main().
 */
public class Main {
    public static void main(String[] args) {
        ru.beletskiy.tasks.TaskInfo.show("04.1-02", "ПР4.1 / Задание 2 — Phone");
        ru.beletskiy.part4.objects.Phone[] phones = {
            new ru.beletskiy.part4.objects.Phone("+79990000001", "Samsung", 180),
            new ru.beletskiy.part4.objects.Phone("+79990000002", "Xiaomi"),
            new ru.beletskiy.part4.objects.Phone()
        };
        for (ru.beletskiy.part4.objects.Phone p : phones) {
            System.out.println(p);
            p.receiveCall("Иван"); System.out.println("Номер: " + p.getNumber());
        }
        phones[0].receiveCall("Анна", "+79993334455");
        phones[0].sendMessage("+79990000002", "+79990000003");
    }
}
