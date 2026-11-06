package ru.beletskiy.part3.movable;
/** Дополнительный пункт ПР3: две вершины с одинаковой скоростью. */
public class MovableRectangle implements Movable {
    private final MovablePoint topLeft, bottomRight;
    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        if (x1 >= x2 || y1 >= y2) throw new IllegalArgumentException("Неверные углы прямоугольника");
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }
    public boolean sameSpeed() {
        return topLeft.getXSpeed() == bottomRight.getXSpeed()
            && topLeft.getYSpeed() == bottomRight.getYSpeed();
    }
    private void checkSpeed() {
        if (!sameSpeed()) throw new IllegalStateException("У обеих точек скорость должна совпадать");
    }
    @Override public void moveUp() { checkSpeed(); topLeft.moveUp(); bottomRight.moveUp(); }
    @Override public void moveDown() { checkSpeed(); topLeft.moveDown(); bottomRight.moveDown(); }
    @Override public void moveLeft() { checkSpeed(); topLeft.moveLeft(); bottomRight.moveLeft(); }
    @Override public void moveRight() { checkSpeed(); topLeft.moveRight(); bottomRight.moveRight(); }
    @Override public String toString() { return "MovableRectangle[topLeft=" + topLeft + ",bottomRight=" + bottomRight + "]"; }
}
