package ru.beletskiy.tasks.ch041.z05;

/**
 * ПР1 часть 4.pdf — ПР4.1 задание 5
 * ПР4.1 / Задание 5 — библиотека
 * Запускайте этот класс отдельно, через зелёный треугольник возле main().
 */
public class Main {
    public static void main(String[] args) {
        ru.beletskiy.tasks.TaskInfo.show("04.1-05", "ПР4.1 / Задание 5 — библиотека");
        ru.beletskiy.part4.objects.Reader[] readers = {
            new ru.beletskiy.part4.objects.Reader("Петров В. В.", "001", "УИБ", "01.01.2004", "89000000000"),
            new ru.beletskiy.part4.objects.Reader("Иванов И. И.", "002", "УИБ", "02.02.2004", "89000000001")
        };
        readers[0].takeBook(3);
        readers[0].takeBook("Приключения", "Словарь", "Энциклопедия");
        ru.beletskiy.part4.objects.Book[] books = {
            new ru.beletskiy.part4.objects.Book("Приключения", "Автор 1"),
            new ru.beletskiy.part4.objects.Book("Словарь", "Автор 2"),
            new ru.beletskiy.part4.objects.Book("Энциклопедия", "Автор 3")
        };
        readers[0].takeBook(books);
        readers[0].returnBook(books);
        readers[1].returnBook(1);
    }
}
