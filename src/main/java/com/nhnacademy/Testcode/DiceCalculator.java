package com.nhnacademy.Testcode;

/**
 * DiceCalculator 클래스.
 */
public class DiceCalculator {
    public static int addDice(Dice first, Dice second) {
        return first.getNum() + second.getNum();
    }

    public static String getIndexOf(String str, int val) {
        return str.substring(0, val + 1);
    }

    public static boolean odd(Dice dice) {
        return dice.getNum() % 2 != 0;
    }
}