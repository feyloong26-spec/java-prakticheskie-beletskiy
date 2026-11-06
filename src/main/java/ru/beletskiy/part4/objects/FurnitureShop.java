package ru.beletskiy.part4.objects;
import java.util.ArrayList;
import java.util.List;
public class FurnitureShop {
    private final List<Furniture> items = new ArrayList<>();
    public void add(Furniture item) { items.add(item); }
    public void display() { for (Furniture f : items) System.out.println(f.description()); }
    public double totalCost() { double result = 0; for (Furniture f : items) result += f.getPrice(); return result; }
}
