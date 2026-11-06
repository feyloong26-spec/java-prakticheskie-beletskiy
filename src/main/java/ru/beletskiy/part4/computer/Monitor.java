package ru.beletskiy.part4.computer;
public final class Monitor {
    private final double diagonalInches;
    private final int widthPx, heightPx;
    public Monitor(double diagonalInches, int widthPx, int heightPx) {
        if (diagonalInches <= 0 || widthPx <= 0 || heightPx <= 0) throw new IllegalArgumentException("Неверные параметры экрана");
        this.diagonalInches = diagonalInches; this.widthPx = widthPx; this.heightPx = heightPx;
    }
    public double getDiagonalInches() { return diagonalInches; }
    public int getWidthPx() { return widthPx; }
    public int getHeightPx() { return heightPx; }
    @Override public String toString() { return diagonalInches + " дюйма, " + widthPx + "x" + heightPx; }
}
