package ru.beletskiy.part4.objects;
/** ПР4.1, задание 10: транспорт, время и тарифы пассажирской/грузовой перевозки. */
public abstract class Transport {
    private final String name;
    private final double speedKmH, passengerRate, freightRate;
    protected Transport(String name, double speedKmH, double passengerRate, double freightRate) {
        this.name = name; this.speedKmH = speedKmH;
        this.passengerRate = passengerRate; this.freightRate = freightRate;
    }
    public String getName() { return name; }
    public double travelHours(double km) { return km / speedKmH; }
    public double passengerCost(double km, int passengers) { return km * passengerRate * passengers; }
    public double freightCost(double km, double tons) { return km * freightRate * tons; }
}
