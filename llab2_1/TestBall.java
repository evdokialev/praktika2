package llab2_1;

import java.lang.*;

public class TestBall {
    public static void main(String[] args) {
        BallJava b1 = new BallJava(100, 100);
        System.out.println(b1);
        b1.move(30, 15);
        System.out.println(b1);
    }
}
