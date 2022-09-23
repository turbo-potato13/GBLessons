package com.vtb.kortunov.lesson3.member;

public class Cat implements Member {

    private final int runLength;
    private final int jumpHeight;

    public Cat(int runLength, int jumpHeight) {
        this.runLength = runLength;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public boolean run(int length) {
        boolean bool = runLength >= length;
        if (bool) {
            System.out.println("Кот пробежал");
        } else {
            System.out.println("Кот не пробежал");
        }
        return bool;
    }

    @Override
    public boolean jump(int height) {
        boolean bool = jumpHeight >= height;
        if (bool) {
            System.out.println("Кот перепрыгнул");
        } else {
            System.out.println("Кот не перепрыгнул");
        }
        return bool;
    }

}
