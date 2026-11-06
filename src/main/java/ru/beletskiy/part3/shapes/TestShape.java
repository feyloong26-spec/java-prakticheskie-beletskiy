package ru.beletskiy.part3.shapes;
/** Проверка полиморфизма, upcast/downcast из методички. */
public class TestShape {
    public static void main(String[] args) {
        System.out.println("=== ПР1 ч.3: Shape / полиморфизм ===");
        Shape s1 = new Circle(5.5, "RED", false);
        print(s1);
        // s1.getRadius() — ошибка компиляции: у ссылочного типа Shape нет этого метода.
        Circle c1 = (Circle) s1;
        System.out.println("Радиус после приведения: " + c1.getRadius());
        // new Shape() — ошибка компиляции: нельзя создать абстрактный класс.
        Shape s3 = new Rectangle(1.0, 2.0, "RED", false);
        print(s3);
        // s3.getLength() — ошибка компиляции: метод есть лишь у Rectangle.
        Rectangle r1 = (Rectangle) s3;
        System.out.println("Длина после приведения: " + r1.getLength());
        Shape s4 = new Square(6.6);
        print(s4);
        Rectangle r2 = (Rectangle) s4; // допустимо: Square наследует Rectangle
        System.out.println("Длина квадрата через Rectangle: " + r2.getLength());
        // r2.getSide() — ошибка компиляции: тип Rectangle не содержит getSide().
        Square sq1 = (Square) r2;
        System.out.println("Сторона квадрата после приведения: " + sq1.getSide());
        System.out.println("Вывод: вызывается переопределение по реальному типу объекта.");
    }
    private static void print(Shape shape) {
        System.out.printf("%s | %s | площадь=%.3f | периметр=%.3f | цвет=%s | закрашено=%s%n",
             shape.getType(), shape, shape.getArea(), shape.getPerimeter(), shape.getColor(), shape.isFilled());
    }
}
