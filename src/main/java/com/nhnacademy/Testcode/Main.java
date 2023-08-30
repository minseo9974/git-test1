package com.nhnacademy.Testcode;

/**
 * Main 클래스 입니다.
 */
public class Main {

    /**
     * main 메서드입니다.
     *
     * @param args input 인자
     */
    public static void main(String[] args) {
        /*
        int random1 = (int)(Math.random() * 6) + 1;
        int random2 = (int)(Math.random() * 6) + 1;

        Dice first = new Dice(random1);
        Dice second = new Dice(random2);

        System.out.println("주사위 합 = " + DiceCalculator.addDice(first ,second));

        String str = "abcdefg";
//            random 값의 인덱스만큼 문자열 출력
//            0 -> "a"
//            1 -> "ab"
//            2 -> "abc"
        int val = (int)(Math.random() * str.length());
        System.out.println(DiceCalculator.getIndexOf(str, val));

        int random4 = (int) (Math.random() * 6) + 1;
        Dice dice = new Dice(random4);
        System.out.println("주사위 눈(" + random4 +")이 홀수??: " + DiceCalculator.odd(dice));
//            출력 결과
//            주사위 합 = 9
//            ab
//            주사위 눈(2)이 홀수 ?? : false
        */
        // ====================================================================================

        String book1 = "해리포터";

        Library library = new Library(5);

        library.add(book1);
        library.add("{샬롯의 거미줄}");
        System.out.println();

        library.delete("{스파이더맨}");
        library.delete(book1);
        System.out.println();

        library.find("{샬롯의 거미줄}");
        library.find(book1);
        System.out.println();

        library.findAll();

        library.add("Java7");
        library.add("Java8");
        library.add("Java9");
        library.add("Java11");

        library.findAll();
    }
}