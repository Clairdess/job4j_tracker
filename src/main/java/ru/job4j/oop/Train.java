package ru.job4j.oop;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("Train chill on rails");
    }

    @Override
    public boolean addPassenger(int count) {
        return false;
    }
}
