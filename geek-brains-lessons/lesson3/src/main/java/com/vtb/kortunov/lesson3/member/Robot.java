package com.vtb.kortunov.lesson3.member;

public class Robot implements Member {

    private final int runLength;
    private final int jumpHeight;

    public Robot(int runLength, int jumpHeight) {
        this.runLength = runLength;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public boolean run(int length) {
        boolean bool = runLength >= length;
        if (bool) {
            System.out.println("Робот пробежал");
        } else {
            System.out.println("Робот не пробежал");
        }
        return bool;
    }

    @Override
    public boolean jump(int height) {
        boolean bool = jumpHeight >= height;
        if (bool) {
            System.out.println("Робот перепрыгнул");
        } else {
            System.out.println("Робот не перепрыгнул");
        }
        return bool;
    }

}
