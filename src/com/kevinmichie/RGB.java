package com.kevinmichie;

public class RGB {

    private int r;
    private int g;
    private int b;

    public RGB() {
        r = 0;
        g = 0;
        b = 0;
    }

    public RGB(int x, int y, int z) {
        r = x;
        g = y;
        b = z;
    }

    public void set (int x, int y, int z) {
        r = x;
        g = y;
        b = z;
    }

    public String toString() {
        return "(" + r + ", " + g + ", " + b + ")";
    }
}
