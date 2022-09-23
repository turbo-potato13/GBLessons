package com.vtb.kortunov.lesson3.barrier;


import com.vtb.kortunov.lesson3.member.Member;

public class RunningTrack implements Barrier {

    private final int length;

    public RunningTrack(int length) {
        this.length = length;
    }

    @Override
    public boolean reach(Member member) {
        return member.run(length);
    }
}
