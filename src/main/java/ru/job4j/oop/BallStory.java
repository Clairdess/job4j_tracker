package ru.job4j.oop;

public class BallStory {
    private static Ball ball = new Ball();
    private static Fox fox = new Fox();
    private static Wolf wolf = new Wolf();
    private static Hare hare = new Hare();

    public static void main(String[] args) {
        wolf.tryEat(ball);
        hare.tryEat(ball);
        fox.tryEat(ball);
    }
}
