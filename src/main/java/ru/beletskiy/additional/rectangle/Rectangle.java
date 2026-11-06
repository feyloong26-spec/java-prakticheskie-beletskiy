package ru.beletskiy.additional.rectangle;
public class Rectangle {
    private double width = -1, height = -1;
    public Rectangle() { }
    public Rectangle(double width, double height) { this.width = width; this.height = height; }
    public double getWidth() { return width; }
    public double getHeight() { return height; }
    public double getArea() { return width * height; }
    public double getPerimeter() { return 2 * (width + height); }
}
