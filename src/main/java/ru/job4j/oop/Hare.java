package ru.job4j.oop;

public class Hare {
    boolean canEatBall = false;

    public void tryEat(Ball ball) {
        ball.tryRun(canEatBall);
    }
}
