package ru.beletskiy.part3.shapes;
public class Rectangle extends Shape {
    protected double width, length;
    public Rectangle() { this(1, 1); }
    public Rectangle(double width, double length) { this(width, length, "green", true); }
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled); setWidth(width); setLength(length);
    }
    public double getWidth() { return width; }
    public void setWidth(double width) {
        if (width < 0) throw new IllegalArgumentException("Отрицательная ширина");
        this.width = width;
    }
    public double getLength() { return length; }
    public void setLength(double length) {
        if (length < 0) throw new IllegalArgumentException("Отрицательная длина");
        this.length = length;
    }
    @Override public double getArea() { return width * length; }
    @Override public double getPerimeter() { return 2 * (width + length); }
    @Override public String getType() { return "Прямоугольник"; }
    @Override public String toString() { return "Rectangle[width=" + width + ",length=" + length + "," + super.toString() + "]"; }
}
