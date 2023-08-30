package com.nhnacademy.Testcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

class DiceCalculatorTest {
    /**
     * DiceCalculator 메서드 테스트 작성
     */

    static Stream<Arguments> diceValue() {
        return Stream.of(
                Arguments.of(1, 2, 3),
                Arguments.of(4, 5, 9),
                Arguments.of(6, 6, 12),
                Arguments.of(1, 1, 2),
                Arguments.of(3, 2, 5)
        );
    }

    @ParameterizedTest(name = "Dice {0} + Dice{1} = {2}")
    @MethodSource("diceValue")
    @DisplayName("DiceCalculator.addDice Param 테스트")
    void diceAddTest(int first, int second, int result) {
        Dice firstDice = new Dice(first);
        Dice secondDice = new Dice(second);
        assertEquals(result, DiceCalculator.addDice(firstDice, secondDice));

    }


    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5, 6})
    @DisplayName("여러 객체 getIndexOf 작성")
    void getIndexOfs(int n) {
        String str = "abcdefg";
        Dice dice = new Dice(n);
        assertEquals(str.substring(0, dice.getNum() + 1), DiceCalculator.getIndexOf(str, dice.getNum()));
    }

    @Test
    @DisplayName("odd 실패 테스트 작성")
    void oddFail() {
        Dice dice = new Dice(4);
        Assertions.assertFalse(DiceCalculator.odd(dice));
    }
}