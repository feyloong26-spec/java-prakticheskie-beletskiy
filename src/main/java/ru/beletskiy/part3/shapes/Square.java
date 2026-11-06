package ru.beletskiy.part3.shapes;
/** Квадрат — прямоугольник с гарантированно одинаковыми сторонами. */
public class Square extends Rectangle {
    public Square() { this(1); }
    public Square(double side) { this(side, "green", true); }
    public Square(double side, String color, boolean filled) { super(side, side, color, filled); }
    public double getSide() { return width; }
    public void setSide(double side) { super.setWidth(side); super.setLength(side); }
    @Override public void setWidth(double side) { setSide(side); }
    @Override public void setLength(double side) { setSide(side); }
    @Override public String getType() { return "Квадрат"; }
    @Override public String toString() { return "Square[side=" + getSide() + "," + super.toString() + "]"; }
}
