package ru.beletskiy.tasks;

/** Единый формат шапки для показа преподавателю. */
public final class TaskInfo {
    private TaskInfo() {}
    public static void show(String number, String name) {
        System.out.println("========================================================");
        System.out.println(number + " — " + name);
        System.out.println("Белецкий А.Ю. | УИБО-03-24");
        System.out.println("========================================================");
    }
}
