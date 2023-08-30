package com.nhnacademy.Testcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class LibraryTest {
    @Test
    @DisplayName("preCondition Test")
    void preConditionTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Library(-1));
    }

    @ParameterizedTest
    @DisplayName("Library constructor Test")
    @ValueSource(ints = {1, 10, 100, 1000})
    void libraryTest(int size) {
        Library library = new Library(size);

        Assertions.assertEquals(size, library.getSize());
    }

    @Test
    @DisplayName("Library add() Test")
    void addTest() {
        Library library = new Library(1);
        library.add("book1");
        Assertions.assertEquals(1, library.getTop());
    }

    @Test
    @DisplayName("Library 꽉 찬 경우 테스트")
    void fullLibraryTest() {
        Library library = new Library(1);
        library.add("book1");

        Assertions.assertThrows(IllegalArgumentException.class, () -> library.add("book2"));
    }

    @Test
    @DisplayName("Library 중복 된 경우 테스트")
    void 중복LibraryTest() {
        Library library = new Library(2);
        library.add("book1");

        Assertions.assertThrows(IllegalArgumentException.class, () -> library.add("book1"));
    }


    @Test
    @DisplayName("Library 삭제 성공 테스트")
    void delete() {
        Library library = new Library(2);
        library.add("book1");
        library.add("book2");
        library.delete("book1");
        Assertions.assertEquals(1, library.getTop());
    }


}