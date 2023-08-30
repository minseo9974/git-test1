package com.nhnacademy.Testcode;

import java.util.Random;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class DiceTest {
    @Test
    @DisplayName("Dice 객체 생성 테스트")
    void diceConstructorTest() {
        Dice dice = new Dice(4);
        Assertions.assertEquals(4, dice.getNum());
    }

    @Test
    @DisplayName("Dice 랜덤 객체 생성 테스트")
    void randomDiceConstructor() {
        Random r = new Random();
        int[] arr = new int[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = r.nextInt(6) + 1;
            Dice dice = new Dice(arr[i]);
            Assertions.assertEquals(arr[i], dice.getNum());
        }
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5, 6})
    @DisplayName("Dice 객체 Param Test")
    void diceParamtest(int n) {
        Dice dice = new Dice(n);
        Assertions.assertEquals(n, dice.getNum());
    }

    @Test
    @DisplayName("Dice 객체 생성 테스트 (Number = -1)")
    void negativeDiceConstructor() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Dice(-1));
    }

    @Test
    @DisplayName("Dice 객체 생성 테스트 (Number = 7)")
    void overDiceConstructor() {
        try {
            new Dice(7);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Dice(7));
    }

}
