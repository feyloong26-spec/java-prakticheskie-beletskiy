package ru.beletskiy.part4.objects;
/** ПР4.1, задание 7. */
public abstract class Learner {
    protected final String name;
    public Learner(String name) { this.name = name; }
    @Override public String toString() { return getClass().getSimpleName() + " " + name; }
}
