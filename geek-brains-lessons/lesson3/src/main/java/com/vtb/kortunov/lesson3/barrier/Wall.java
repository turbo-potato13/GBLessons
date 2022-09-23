package com.vtb.kortunov.lesson3.barrier;


import com.vtb.kortunov.lesson3.member.Member;

public class Wall implements Barrier {

    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean reach(Member member) {
        return member.jump(height);
    }
}
