package ru.beletskiy.tasks.ch041.z09;

/**
 * ПР1 часть 4.pdf — ПР4.1 задание 9
 * ПР4.1 / Задание 9 — мебель
 * Запускайте этот класс отдельно, через зелёный треугольник возле main().
 */
public class Main {
    public static void main(String[] args) {
        ru.beletskiy.tasks.TaskInfo.show("04.1-09", "ПР4.1 / Задание 9 — мебель");
        ru.beletskiy.part4.objects.FurnitureShop shop = new ru.beletskiy.part4.objects.FurnitureShop();
        shop.add(new ru.beletskiy.part4.objects.Chair("дерево", 2500));
        shop.add(new ru.beletskiy.part4.objects.TableFurniture("металл", 6100));
        shop.display();
        System.out.println("Общая стоимость мебели: " + shop.totalCost() + " руб.");
    }
}
