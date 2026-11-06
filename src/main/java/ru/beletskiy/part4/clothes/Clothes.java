package ru.beletskiy.part4.clothes;
public abstract class Clothes {
    protected final Size size;
    protected final double price;
    protected final String color;
    public Clothes(Size size, double price, String color) {
        this.size = size; this.price = price; this.color = color;
    }
    public Size getSize() { return size; }
    public double getPrice() { return price; }
    public String getColor() { return color; }
    @Override public String toString() {
        return getClass().getSimpleName() + ": " + size + " (EU " + size.getEuroSize() + ") "
            + size.getDescription() + ", " + color + ", " + price + " ₽";
    }
}
