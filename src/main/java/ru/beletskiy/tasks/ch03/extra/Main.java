package ru.beletskiy.tasks.ch03.extra;

/**
 * ПР1 часть 3.pdf — дополнительное задание MovableRectangle
 * Часть 3 / Дополнение — MovableRectangle
 * Запускайте этот класс отдельно, через зелёный треугольник возле main().
 */
public class Main {
    public static void main(String[] args) {
        ru.beletskiy.tasks.TaskInfo.show("03.ДОП", "Часть 3 / Дополнение — MovableRectangle");
        ru.beletskiy.part3.movable.MovableRectangle r =
                new ru.beletskiy.part3.movable.MovableRectangle(1, 2, 8, 9, 2, 3);
        System.out.println("Равные скорости двух вершин: " + r.sameSpeed());
        System.out.println("До движения: " + r);
        r.moveDown(); r.moveRight();
        System.out.println("После движения: " + r);
    }
}
