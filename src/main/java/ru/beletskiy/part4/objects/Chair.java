package ru.beletskiy.part4.objects;
public class Chair extends Furniture {
    public Chair(String material, double price) { super(material, price); }
    @Override public String description() { return "Стул из материала " + material + ", " + price + " ₽"; }
}
