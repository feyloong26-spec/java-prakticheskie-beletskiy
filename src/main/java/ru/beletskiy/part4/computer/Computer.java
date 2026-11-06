package ru.beletskiy.part4.computer;
/** Композиция: компьютер состоит из процессора, памяти и монитора. */
public final class Computer {
    private final Brand brand;
    private final Processor processor;
    private final Memory memory;
    private final Monitor monitor;
    public Computer(Brand brand, Processor processor, Memory memory, Monitor monitor) {
        if (brand == null || processor == null || memory == null || monitor == null)
            throw new IllegalArgumentException("Все компоненты обязательны");
        this.brand = brand; this.processor = processor; this.memory = memory; this.monitor = monitor;
    }
    public Brand getBrand() { return brand; }
    public Processor getProcessor() { return processor; }
    public Memory getMemory() { return memory; }
    public Monitor getMonitor() { return monitor; }
    public boolean canRunWithAtLeast(int ramGB, int cores) {
        return memory.getRamGB() >= ramGB && processor.getCores() >= cores;
    }
    @Override public String toString() {
        return "Компьютер " + brand + "\n  Процессор: " + processor
            + "\n  Память: " + memory + "\n  Монитор: " + monitor;
    }
}
