package com.nhnacademy.Testcode;


/**
 * Dice 클래스.
 */
public class Dice {
    private int num;

    public Dice(int num) {
        if (num <= 0 || num >= 7) {
            throw new IllegalArgumentException("Invalid Number");
        }
        this.num = num;
    }

    public int getNum() {
        return num;
    }
}