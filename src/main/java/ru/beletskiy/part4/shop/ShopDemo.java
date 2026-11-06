package ru.beletskiy.part4.shop;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/** ПР4, задание 3: консольный мини-магазин с авторизацией, каталогом, корзиной и покупкой. */
public class ShopDemo {
    private static final Product[] CATALOG = {
        new Product(1, "Ноутбук", Category.ELECTRONICS, 75000),
        new Product(2, "Наушники", Category.ELECTRONICS, 3500),
        new Product(3, "Java для начинающих", Category.BOOKS, 1100),
        new Product(4, "Алгоритмы", Category.BOOKS, 1300),
        new Product(5, "Футболка", Category.CLOTHES, 1200)
    };
    public static void main(String[] args) { run(new Scanner(System.in)); }
    public static void run(Scanner sc) {
        System.out.println("=== ПР4 Задание 3. Интернет-магазин ===");
        System.out.println("Демо-аккаунт: student / java123");
        System.out.print("Логин: "); String login = sc.nextLine();
        System.out.print("Пароль: "); String password = sc.nextLine();
        if (!"student".equals(login) || !"java123".equals(password)) {
            System.out.println("Ошибка авторизации."); return;
        }
        System.out.println("Успешный вход!");
        List<Product> cart = new ArrayList<>();
        while (true) {
            System.out.println("\n1 — Категории, 2 — Товары категории, 3 — Все товары, 4 — Добавить в корзину, 5 — Купить, 0 — Выход");
            System.out.print("Команда: ");
            if (!sc.hasNextInt()) { System.out.println("Завершение (неверный ввод)."); return; }
            int command = sc.nextInt();
            switch (command) {
                case 1 -> { for (Category c : Category.values()) System.out.println((c.ordinal() + 1) + ": " + c); }
                case 2 -> {
                    System.out.print("Категория (1–3): ");
                    if (!sc.hasNextInt()) { sc.nextLine(); System.out.println("Введите число."); break; }
                    int categoryNumber = sc.nextInt();
                    if (categoryNumber < 1 || categoryNumber > Category.values().length) { System.out.println("Нет категории."); break; }
                    Category selected = Category.values()[categoryNumber - 1];
                    for (Product p : CATALOG) if (p.getCategory() == selected) System.out.println(p);
                }
                case 3 -> { for (Product p : CATALOG) System.out.println(p); }
                case 4 -> {
                    System.out.print("ID товара: ");
                    if (!sc.hasNextInt()) { sc.nextLine(); System.out.println("Введите число."); break; }
                    int id = sc.nextInt(); Product found = null;
                    for (Product p : CATALOG) if (p.getId() == id) { found = p; break; }
                    if (found == null) System.out.println("Такого товара нет.");
                    else { cart.add(found); System.out.println("В корзине: " + found); }
                }
                case 5 -> {
                    if (cart.isEmpty()) { System.out.println("Корзина пуста."); break; }
                    double sum = 0;
                    for (Product p : cart) { System.out.println(p); sum += p.getPrice(); }
                    System.out.printf("Покупка на %.2f ₽ оформлена (демонстрация, без оплаты).%n", sum);
                    cart.clear();
                }
                case 0 -> { System.out.println("До встречи!"); return; }
                default -> System.out.println("Нет такой команды.");
            }
        }
    }
}
