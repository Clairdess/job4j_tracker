package ru.job4j.oop;

public class Fox {
    boolean canEatBall = true;

    public void tryEat(Ball ball) {
        ball.tryRun(canEatBall);
    }
}
