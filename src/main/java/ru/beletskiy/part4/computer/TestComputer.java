package ru.beletskiy.part4.computer;
public class TestComputer {
    public static void main(String[] args) {
        Computer office = new Computer(Brand.LENOVO, new Processor("Intel Core i5", 6, 3.5),
                new Memory(16, 512), new Monitor(24, 1920, 1080));
        Computer study = new Computer(Brand.ASUS, new Processor("AMD Ryzen 7", 8, 4.2),
                new Memory(32, 1024), new Monitor(27, 2560, 1440));
        System.out.println(office);
        System.out.println("Хватит для задачи (16 ГБ, 6 ядер)? " + office.canRunWithAtLeast(16, 6));
        System.out.println();
        System.out.println(study);
        System.out.println("Марки в enum: " + java.util.Arrays.toString(Brand.values()));
    }
}
