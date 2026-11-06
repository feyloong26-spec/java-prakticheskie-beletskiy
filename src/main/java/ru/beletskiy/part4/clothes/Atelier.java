package ru.beletskiy.part4.clothes;
public class Atelier {
    public void dressWomen(Clothes[] clothes) {
        System.out.println("Женский ассортимент:");
        for (Clothes item : clothes) if (item instanceof WomenClothing) ((WomenClothing) item).dressWomen();
    }
    public void dressMan(Clothes[] clothes) {
        System.out.println("Мужской ассортимент:");
        for (Clothes item : clothes) if (item instanceof MenClothing) ((MenClothing) item).dressMan();
    }
}
