package ru.job4j.oop;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.println("Airplane fly");
    }

    @Override
    public boolean addPassenger(int count) {
        return false;
    }
}
