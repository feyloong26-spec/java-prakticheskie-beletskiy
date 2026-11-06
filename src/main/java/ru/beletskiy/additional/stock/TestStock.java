package ru.beletskiy.additional.stock;
public class TestStock {
    public static void main(String[] args) {
        Stock stock = new Stock("SBER", "ПАО Сбербанк");
        stock.setPreviousClosingPrice(281.50); stock.setCurrentPrice(282.87);
        System.out.printf("%s (%s): изменение цены = %.4f%%%n", stock.getName(), stock.getSymbol(), stock.getChangePercent());
    }
}
