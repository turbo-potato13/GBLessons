package com.vtb.kortunov.lesson5;

import java.util.ArrayList;

public class Transform<T> {

    public ArrayList<T> toArrayList(T[] array) {
        ArrayList<T> arrayList = new ArrayList<>();
        for (T t : array) {
            arrayList.add(t);
        }
        return arrayList;
    }
}
