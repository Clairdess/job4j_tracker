package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Bus moving");
    }

    @Override
    public void passengers(int count) {
        System.out.println("Passengers in bus");
    }

    @Override
    public int refuel(int fuel) {
        return fuel > 1 ? 10 : 0;
    }
}
