package com.vtb.kortunov.lesson5;

public class Swap<T> {

    public void swapped(T[] array, int ind1, int ind2) {
        T temp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = temp;
    }
}
