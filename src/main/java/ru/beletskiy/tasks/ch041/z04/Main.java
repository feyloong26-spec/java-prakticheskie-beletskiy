package ru.beletskiy.tasks.ch041.z04;

/**
 * ПР1 часть 4.pdf — ПР4.1 задание 4
 * ПР4.1 / Задание 4 — Matrix
 * Запускайте этот класс отдельно, через зелёный треугольник возле main().
 */
public class Main {
    public static void main(String[] args) {
        ru.beletskiy.tasks.TaskInfo.show("04.1-04", "ПР4.1 / Задание 4 — Matrix");
        ru.beletskiy.part4.objects.Matrix a = new ru.beletskiy.part4.objects.Matrix(new double[][]{{1,2},{3,4}});
        ru.beletskiy.part4.objects.Matrix b = new ru.beletskiy.part4.objects.Matrix(new double[][]{{5,6},{7,8}});
        System.out.println("Матрица A:"); a.print();
        System.out.println("Матрица B:"); b.print();
        System.out.println("A + B:"); a.add(b).print();
        System.out.println("A * 2:"); a.multiply(2).print();
        System.out.println("A * B:"); a.multiply(b).print();
    }
}
