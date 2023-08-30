package com.fastcampus.ch3;

/**
 * main 클래스입니다.
 */
public class Main {
    /**
     * main 메서드입니다.
     *
     * @param args input 인자
     */

    public static void main(String[] args) {
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