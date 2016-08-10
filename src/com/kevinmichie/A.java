package com.kevinmichie;

/**
 * Created by kevinmichie on 8/9/16.
 */
public class A {
    private int myNum;

    public A (int x) {
        myNum = x;
    }

    public int getNumber() {
        return myNum;
    }

    public String getLetters() {
        return "A";
    }

    public String getMessage() {
        return getLetters() + "-" + getNumber();
    }
}
