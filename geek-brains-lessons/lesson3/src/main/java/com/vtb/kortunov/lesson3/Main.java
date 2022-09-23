package com.vtb.kortunov.lesson3;


import com.vtb.kortunov.lesson3.barrier.Barrier;
import com.vtb.kortunov.lesson3.barrier.RunningTrack;
import com.vtb.kortunov.lesson3.barrier.Wall;
import com.vtb.kortunov.lesson3.member.Cat;
import com.vtb.kortunov.lesson3.member.Member;
import com.vtb.kortunov.lesson3.member.Person;
import com.vtb.kortunov.lesson3.member.Robot;

public class Main {

    public static void main(String[] args) {

        Barrier[] barriers = {new Wall(2), new RunningTrack(3),
            new Wall(8), new RunningTrack(12)};
        Member[] members = {new Cat(10, 8),
            new Person(5, 3), new Robot(15, 15)
        };
        for (Member member : members) {
            for (Barrier barrier : barriers) {
                if (!barrier.reach(member)) {
                    System.out.println("Участник не смог преодолеть полосу");
                    break;
                }
            }
        }
    }

}
