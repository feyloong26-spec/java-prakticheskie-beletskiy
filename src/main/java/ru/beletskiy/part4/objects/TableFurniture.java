package ru.beletskiy.part4.objects;
public class TableFurniture extends Furniture {
    public TableFurniture(String material, double price) { super(material, price); }
    @Override public String description() { return "Стол из материала " + material + ", " + price + " ₽"; }
}
