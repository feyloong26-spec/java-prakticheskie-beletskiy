package ru.beletskiy.part4.computer;
public final class Memory {
    private final int ramGB;
    private final int diskGB;
    public Memory(int ramGB, int diskGB) {
        if (ramGB <= 0 || diskGB <= 0) throw new IllegalArgumentException("Неверный объём памяти");
        this.ramGB = ramGB; this.diskGB = diskGB;
    }
    public int getRamGB() { return ramGB; }
    public int getDiskGB() { return diskGB; }
    @Override public String toString() { return "ОЗУ " + ramGB + " ГБ, накопитель " + diskGB + " ГБ"; }
}
