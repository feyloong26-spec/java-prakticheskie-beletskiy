package ru.beletskiy.additional.stock;
public class Stock {
    private final String symbol, name;
    private double previousClosingPrice, currentPrice;
    public Stock(String symbol, String name) { this.symbol = symbol; this.name = name; }
    public String getSymbol() { return symbol; }
    public String getName() { return name; }
    public void setPreviousClosingPrice(double price) { previousClosingPrice = price; }
    public void setCurrentPrice(double price) { currentPrice = price; }
    public double getChangePercent() {
        if (previousClosingPrice == 0) throw new IllegalStateException("Предыдущая цена не может быть 0");
        return (currentPrice - previousClosingPrice) / previousClosingPrice * 100;
    }
}
