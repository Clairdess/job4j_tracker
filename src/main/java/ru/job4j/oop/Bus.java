package ru.job4j.oop;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println("Bus move");
    }

    @Override
    public boolean addPassenger(int count) {
        return false;
    }
}
