package ru.beletskiy.part4.enums;
public class SeasonDemo {
    public static void main(String[] args) {
        System.out.println("=== ПР4 Задание 1. Времена года ===");
        Season favorite = Season.SUMMER;
        System.out.println("Моё любимое время года: " + favorite.getRussianName());
        printFavorite(favorite);
        for (Season s : Season.values())
            System.out.printf("%-7s | %5.1f °C | %s%n", s.getRussianName(), s.getAverageTemperature(), s.getDescription());
    }
    public static void printFavorite(Season season) {
        switch (season) {
            case WINTER -> System.out.println("Я люблю зиму");
            case SPRING -> System.out.println("Я люблю весну");
            case SUMMER -> System.out.println("Я люблю лето");
            case AUTUMN -> System.out.println("Я люблю осень");
        }
    }
}
