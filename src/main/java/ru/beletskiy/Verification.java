package ru.beletskiy;
import ru.beletskiy.part1.Part1Demo;
import ru.beletskiy.part2.Ball;
import ru.beletskiy.part3.shapes.*;
import ru.beletskiy.part3.movable.MovableRectangle;
import ru.beletskiy.part4.enums.Season;
import ru.beletskiy.part4.clothes.Size;
import ru.beletskiy.part4.objects.*;
import ru.beletskiy.additional.stock.Stock;

/** Проверка вычислений без JUnit и внешних зависимостей. */
public class Verification {
    private static int checks;
    private static void near(double actual, double expected) {
        if (Math.abs(actual - expected) > 1e-7) throw new AssertionError("Ожидалось " + expected + ", получено " + actual);
        checks++;
    }
    private static void isTrue(boolean condition) {
        if (!condition) throw new AssertionError("Нарушено условие проверки");
        checks++;
    }
    public static void main(String[] args) {
        near(Part1Demo.factorial(0), 1); near(Part1Demo.factorial(5), 120);
        Ball ball = new Ball(100, 100); ball.move(30, 15);
        near(ball.getX(), 130); near(ball.getY(), 115);
        Shape circle = new Circle(5.5); near(circle.getArea(), Math.PI * 5.5 * 5.5);
        Shape rectangle = new Rectangle(1, 2); near(rectangle.getPerimeter(), 6);
        Square square = new Square(6.6); square.setLength(4);
        near(square.getWidth(), 4); near(square.getLength(), 4); near(square.getArea(), 16);
        MovableRectangle moving = new MovableRectangle(1, 1, 5, 5, 2, 3);
        isTrue(moving.sameSpeed()); moving.moveRight(); isTrue(moving.toString().contains("(3, 1)"));
        near(Season.SUMMER.getAverageTemperature(), 23); near(Size.XXS.getEuroSize(), 32);
        Matrix m = new Matrix(new double[][] {{1,2},{3,4}});
        near(m.multiply(m).get(0, 0), 7); near(m.add(m).get(1, 1), 8);
        near(new Manager("Иван", "Иванов", 50000, 100000).getIncome(), 700000);
        ru.beletskiy.additional.rectangle.Rectangle rect = new ru.beletskiy.additional.rectangle.Rectangle(4, 40);
        near(rect.getArea(), 160); near(rect.getPerimeter(), 88);
        Stock stock = new Stock("SBER", "ПАО Сбербанк");
        stock.setPreviousClosingPrice(281.50); stock.setCurrentPrice(282.87);
        near(stock.getChangePercent(), (282.87-281.50)/281.50*100);
        System.out.println("ПРОВЕРКА ПРОЙДЕНА: " + checks + " утверждений без ошибок.");
    }
}
