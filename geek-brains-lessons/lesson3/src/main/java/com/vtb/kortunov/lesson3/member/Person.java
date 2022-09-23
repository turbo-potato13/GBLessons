package com.vtb.kortunov.lesson3.member;

public class Person implements Member {

    private final int runLength;
    private final int jumpHeight;

    public Person(int runLength, int jumpHeight) {
        this.runLength = runLength;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public boolean run(int length) {
        boolean bool = runLength >= length;
        if (bool) {
            System.out.println("Человек пробежал");
        } else {
            System.out.println("Человек не пробежал");
        }
        return bool;
    }

    @Override
    public boolean jump(int height) {
        boolean bool = jumpHeight >= height;
        if (bool) {
            System.out.println("Человек перепрыгнул");
        } else {
            System.out.println("Человек не перепрыгнул");
        }
        return bool;
    }

}

