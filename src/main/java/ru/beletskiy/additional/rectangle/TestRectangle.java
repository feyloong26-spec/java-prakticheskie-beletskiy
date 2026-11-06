package ru.beletskiy.additional.rectangle;
public class TestRectangle {
    public static void main(String[] args) {
        print(new Rectangle(4, 40)); print(new Rectangle(3.5, 35.9));
    }
    private static void print(Rectangle r) {
        System.out.printf("Ширина: %.2f; высота: %.2f; площадь: %.2f; периметр: %.2f%n",
            r.getWidth(), r.getHeight(), r.getArea(), r.getPerimeter());
    }
}
