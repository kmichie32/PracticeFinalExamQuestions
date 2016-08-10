package com.kevinmichie;

/**
 * Created by kevinmichie on 8/9/16.
 */
public class Unknown {
    private int x;

    public Unknown()
    {
        x = 7;
        method1(); // Should print 9
        method2(3); // Should print 8
        method3(); // Should print 9
        System.out.println(x + "A"); // Should print 9
    }

    public void method1() {
        x++;
        int x = this.x;
        x++;
        System.out.println(x + "B");
    }

    public void method2(int x) {
        x++;
        x = 5;
        x++;
        System.out.println(this.x + "C");
    }

    public void method3() {
        x++;
        System.out.println(x + "D");
    }
}
