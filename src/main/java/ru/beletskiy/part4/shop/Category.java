package ru.beletskiy.part4.shop;
public enum Category { ELECTRONICS("Электроника"), BOOKS("Книги"), CLOTHES("Одежда");
    private final String title;
    Category(String title) { this.title = title; }
    @Override public String toString() { return title; }
}
