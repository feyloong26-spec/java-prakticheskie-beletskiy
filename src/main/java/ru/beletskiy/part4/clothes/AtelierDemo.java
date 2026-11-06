package ru.beletskiy.part4.clothes;
public class AtelierDemo {
    public static void main(String[] args) {
        System.out.println("=== ПР4 Задание 2. Ателье ===");
        Clothes[] stock = {
            new TShirt(Size.XXS, 699, "желтый"), new Pants(Size.M, 2400, "черный"),
            new Skirt(Size.S, 1790, "синий"), new Tie(Size.L, 690, "бордовый")
        };
        Atelier atelier = new Atelier(); atelier.dressWomen(stock); atelier.dressMan(stock);
    }
}
