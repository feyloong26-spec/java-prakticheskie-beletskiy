package ru.beletskiy.part4.shop;
public class Product {
    private final int id;
    private final String name;
    private final Category category;
    private final double price;
    public Product(int id, String name, Category category, double price) {
        this.id = id; this.name = name; this.category = category; this.price = price;
    }
    public int getId() { return id; }
    public Category getCategory() { return category; }
    public double getPrice() { return price; }
    @Override public String toString() { return id + ". " + name + " (" + category + ") — " + price + " ₽"; }
}
