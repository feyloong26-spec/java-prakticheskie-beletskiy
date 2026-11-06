package ru.beletskiy.part4.computer;
public final class Processor {
    private final String model;
    private final int cores;
    private final double clockGHz;
    public Processor(String model, int cores, double clockGHz) {
        if (cores <= 0 || clockGHz <= 0) throw new IllegalArgumentException("Неверные параметры CPU");
        this.model = model; this.cores = cores; this.clockGHz = clockGHz;
    }
    public String getModel() { return model; }
    public int getCores() { return cores; }
    public double getClockGHz() { return clockGHz; }
    @Override public String toString() { return model + " (" + cores + " ядер, " + clockGHz + " ГГц)"; }
}
