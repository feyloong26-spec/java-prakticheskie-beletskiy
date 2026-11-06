package ru.beletskiy.additional;
public class AdditionalDemo {
    public static void main(String[] args) {
        System.out.println("=== Дополнительные задания ===");
        ru.beletskiy.additional.errors.TestA.main(args);
        ru.beletskiy.additional.errors.DefaultBooleanDemo.main(args);
        System.out.println("=== Rectangle: два объекта ===");
        ru.beletskiy.additional.rectangle.TestRectangle.main(args);
        System.out.println("=== Stock: SBER ===");
        ru.beletskiy.additional.stock.TestStock.main(args);
    }
}
