package com.kevinmichie;

/**
 * Created by kevinmichie on 8/9/16.
 */
public class AB extends A {

    public AB(int x) {
        super(x * 3);
    }

    @Override
    public int getNumber() {
        return super.getNumber() + 2;
    }

    @Override
    public String getLetters() {
        return "AB";
    }
}
