package ru.beletskiy.part4.clothes;
public class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(Size size, double price, String color) { super(size, price, color); }
    @Override public void dressMan() { System.out.println("Мужские брюки: " + this); }
    @Override public void dressWomen() { System.out.println("Женские брюки: " + this); }
}
