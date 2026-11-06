package ru.beletskiy.part2;
public class TestBall {
    public static void main(String[] args) {
        System.out.println("=== ПР1 ч.2: Ball ===");
        Ball ball = new Ball(100, 100);
        System.out.println(ball);
        ball.move(30, 15);
        System.out.println(ball);
    }
}
