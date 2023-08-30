package com.fastcampus.ch3;

public class Library {
    private String book[];
    private int size;
    private static int top;

    public Library(int size) {
        this.size = size;
        ClassInvariant();
        this.top = 0;
        book = new String[size];
        for (int i = 0; i < size; i++) {
            book[i] = "";
        }
    }

    private void ClassInvariant() {
        if (this.getSize() <= 0) {
            throw new IllegalArgumentException("size is under zero");
        }
    }

    public int getSize() {
        return size;
    }

    public void add(String s) {
        if (top == size) {
            throw new IllegalArgumentException("사이즈 초과했습니다.");
        }
        for (int i = 0; i <= top; i++) {
            if (s.equals(book[i])) {
                System.out.println("[" + book[i] + "] 은 이미 있는 책 입니다.");
                return;
            }
        }
        book[top] = s;
        System.out.println("[" + book[top++] + "] 책을 추가 하였습니다.");
    }

    public void delete(String s) {
        if (top < 0) {
            System.out.println("비었습니다.");
            return;
        }
        for (int i = 0; i <= top; i++) {
            if (book[i].equals(s)) {
                System.out.println(book[i] + "첵 을 지웠습니다.");
                for (int j=i; j<=top; j++){
                    book[j] = book[j+1];
                }
                book[top--] = "";
                if (top == -1) { //비었을때 top 초기화
                    top = 0;
                }
                return;
            }
        }
        System.out.println(s + "책 은 존재 하지 않아 지울수 없습니다.");
    }

    public void find(String s) {
        for (int i = 0; i <= top; i++) {
            if (book[i].equals(s)) {
                System.out.println("책 검색 결과 " + book[i]);
                return;
            }
        }
        System.out.println("없는책");
    }

    public void findAll() {
        System.out.println("===========================");
        for (int i = 0; i < top; i++) {
            System.out.println(i + 1 + ": " + book[i]);
        }
        System.out.println("===========================");
    }
}
