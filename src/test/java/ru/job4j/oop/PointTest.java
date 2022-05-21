package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {

        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        Point point = new Point(x1, y1);
        Point secondPoint = new Point(x2, y2);
        double out = point.distance(secondPoint);
        Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void when85to00then9dot433() {
        double expected = 9.433;
        int x1 = 8;
        int y1 = 5;
        int x2 = 0;
        int y2 = 0;
        Point point = new Point(x1, y1);
        Point secondPoint = new Point(x2, y2);
        double out = point.distance(secondPoint);
        Assert.assertEquals(expected, out, 0.1);
        Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void when12to99then10dot630() {
        double expected = 10.630;
        int x1 = 1;
        int y1 = 2;
        int x2 = 9;
        int y2 = 9;
        Point point = new Point(x1, y1);
        Point secondPoint = new Point(x2, y2);
        double out = point.distance(secondPoint);
        Assert.assertEquals(expected, out, 0.1);
        Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void when52to99then8dot062() {
        double expected = 8.062;
        int x1 = 5;
        int y1 = 2;
        int x2 = 9;
        int y2 = 9;
        Point point = new Point(x1, y1);
        Point secondPoint = new Point(x2, y2);
        double out = point.distance(secondPoint);
        Assert.assertEquals(expected, out, 0.1);
        Assert.assertEquals(expected, out, 0.1);
    }

}