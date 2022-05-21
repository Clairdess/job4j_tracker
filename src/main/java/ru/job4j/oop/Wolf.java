package ru.job4j.oop;

public class Wolf {
    boolean canEatBall = false;

    public void tryEat(Ball ball) {
        ball.tryRun(canEatBall);
    }
}
