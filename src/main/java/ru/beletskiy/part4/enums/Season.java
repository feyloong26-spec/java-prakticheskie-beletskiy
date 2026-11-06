package ru.beletskiy.part4.enums;
/** Практическая №4, задание 1: времена года и средняя температура. */
public enum Season {
    WINTER(-5), SPRING(9), SUMMER(23) {
        @Override public String getDescription() { return "Теплое время года"; }
    }, AUTUMN(8);
    private final double averageTemperature;
    Season(double averageTemperature) { this.averageTemperature = averageTemperature; }
    public double getAverageTemperature() { return averageTemperature; }
    public String getDescription() { return "Холодное время года"; }
    public String getRussianName() {
        return switch (this) {
            case WINTER -> "Зима";
            case SPRING -> "Весна";
            case SUMMER -> "Лето";
            case AUTUMN -> "Осень";
        };
    }
}
