package ru.beletskiy.part4.objects;
/** ПР4.1, задание 9: абстрактная мебель. */
public abstract class Furniture {
    protected final String material;
    protected final double price;
    public Furniture(String material, double price) { this.material = material; this.price = price; }
    public abstract String description();
    public double getPrice() { return price; }
}
