package ru.beletskiy.part2;
/** ПР1 часть 2: двигающийся мяч (пример диаграммы UML). */
public class Ball {
    private double x, y;
    public Ball() { this(0, 0); }
    public Ball(double x, double y) { this.x = x; this.y = y; }
    public double getX() { return x; }
    public double getY() { return y; }
    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }
    public void setXY(double x, double y) { this.x = x; this.y = y; }
    public void move(double xDisp, double yDisp) { x += xDisp; y += yDisp; }
    @Override public String toString() { return "Ball @ (" + x + ", " + y + ")."; }
}
