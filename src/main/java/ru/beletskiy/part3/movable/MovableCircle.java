package ru.beletskiy.part3.movable;
public class MovableCircle implements Movable {
    private final int radius;
    private final MovablePoint center;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        if (radius <= 0) throw new IllegalArgumentException("Радиус должен быть положительным");
        center = new MovablePoint(x, y, xSpeed, ySpeed); this.radius = radius;
    }
    public MovablePoint getCenter() { return center; }
    public int getRadius() { return radius; }
    @Override public void moveUp() { center.moveUp(); }
    @Override public void moveDown() { center.moveDown(); }
    @Override public void moveLeft() { center.moveLeft(); }
    @Override public void moveRight() { center.moveRight(); }
    @Override public String toString() { return "MovableCircle[center=" + center + ", radius=" + radius + "]"; }
}
