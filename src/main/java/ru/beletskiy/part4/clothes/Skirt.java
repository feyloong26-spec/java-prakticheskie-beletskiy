package ru.beletskiy.part4.clothes;
public class Skirt extends Clothes implements WomenClothing {
    public Skirt(Size size, double price, String color) { super(size, price, color); }
    @Override public void dressWomen() { System.out.println("Юбка: " + this); }
}
