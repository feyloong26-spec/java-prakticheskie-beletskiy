package ru.beletskiy.part3.movable;
public class TestMovable {
    public static void main(String[] args) {
        System.out.println("=== ПР1 ч.3: Movable ===");
        MovablePoint point = new MovablePoint(3, 4, 2, 1);
        point.moveRight(); point.moveUp(); System.out.println("Точка: " + point);
        MovableCircle circle = new MovableCircle(10, 10, 3, 2, 5);
        circle.moveLeft(); System.out.println("Круг: " + circle);
        MovableRectangle rect = new MovableRectangle(1, 2, 8, 9, 2, 3);
        System.out.println("Равные скорости? " + rect.sameSpeed());
        rect.moveDown(); rect.moveRight(); System.out.println("Прямоугольник: " + rect);
    }
}
