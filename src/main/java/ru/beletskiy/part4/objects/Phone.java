package ru.beletskiy.part4.objects;
/** ПР4.1, задание 2. */
public class Phone {
    private String number, model;
    private double weight;
    public Phone() { this("не указан", "не указана"); }
    public Phone(String number, String model) { this.number = number; this.model = model; }
    public Phone(String number, String model, double weight) { this(number, model); this.weight = weight; }
    public String getNumber() { return number; }
    public String getModel() { return model; }
    public double getWeight() { return weight; }
    public void receiveCall(String caller) { System.out.println("Звонит " + caller); }
    public void receiveCall(String caller, String callerNumber) {
        System.out.println("Звонит " + caller + " с номера " + callerNumber);
    }
    public void sendMessage(String... numbers) {
        System.out.println("Сообщение отправлено на номера:");
        for (String number : numbers) System.out.println("  " + number);
    }
    @Override public String toString() { return "Phone[number=" + number + ",model=" + model + ",weight=" + weight + "]"; }
}
