package ru.beletskiy.tasks.ch041.z10;

/**
 * ПР1 часть 4.pdf — ПР4.1 задание 10
 * ПР4.1 / Задание 10 — транспорт
 * Запускайте этот класс отдельно, через зелёный треугольник возле main().
 */
public class Main {
    public static void main(String[] args) {
        ru.beletskiy.tasks.TaskInfo.show("04.1-10", "ПР4.1 / Задание 10 — транспорт");
        ru.beletskiy.part4.objects.Transport[] vehicles = {
            new ru.beletskiy.part4.objects.Car(), new ru.beletskiy.part4.objects.Airplane(),
            new ru.beletskiy.part4.objects.Train(), new ru.beletskiy.part4.objects.Ship()
        };
        for (ru.beletskiy.part4.objects.Transport t : vehicles) {
            double distance = 600;
            System.out.printf("%s: 600 км за %.2f ч; 3 пассажира — %.2f руб.; 2 т груза — %.2f руб.%n",
                t.getName(), t.travelHours(distance), t.passengerCost(distance,3), t.freightCost(distance,2));
        }
        System.out.println("Скорости и тарифы — демонстрационные; в методичке числа не заданы.");
    }
}
