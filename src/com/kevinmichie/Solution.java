package com.kevinmichie;

import java.util.ArrayList;
import java.util.List;

public class Solution<E> {

    public ArrayList<String> removeDuplicates(ArrayList<String> arrayListToCheck) {
        for(int i = 0; i <= arrayListToCheck.size(); i++) {
            for(int j = 1; j <= arrayListToCheck.size(); j++) {
                if(j+i < arrayListToCheck.size()) {
                    if (arrayListToCheck.get(i).equals(arrayListToCheck.get(j+i))) {
                        arrayListToCheck.remove(j+i);
                    }
                }
            }
        }
        return arrayListToCheck;
    }

    public void printItemsInArrayList(ArrayList<E> arrayListToCheck) {
        for(E items: arrayListToCheck) {
            System.out.println(items);
        }
    }

    public ArrayList<Integer> countNeedles(ArrayList<String> needles, ArrayList<String> haystack) {
        ArrayList<Integer> scoreCount = new ArrayList<>();
        int counter = 0;
        int position = 0;
        for(int i = 0; i < needles.size(); i++) {
            for(int j = 0; j < haystack.size(); j++) {
                if (needles.get(i).equals(haystack.get(j))) {
                    counter++;
                }
                if(j == haystack.size() - 1) {
                    scoreCount.add(position,counter);
                    counter = 0;
                    position++;
                }
            }
        }
        return scoreCount;
    }

    public void fn() {
        int grade = 81;
        int level = -3;
        if (grade >= 90) {
            if (level <= -2) {
                System.out.println("A-level");
            }
        }
        else {
            System.out.println("B-status");
        }
    }

    public void printSomething() {
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 2; j++) {
                sum++;
            }
            System.out.println(sum);
        }
    }

    public int rangeSum(List<Integer> list, int low, int high) {
        int num = 0;
        int sum = 0;

        for (int idx = 0; idx < list.size(); idx++) {
            int ival = list.get(idx);
            if (ival >= low || ival <= high) {
                num++;
                sum += ival;
            }
        }
        return sum;
    }

    // Assuming matrix sizes are the same
    public int[][] addMatrices(int[][] a, int[][] b) {
        int[][] summedUpMatrix = new int[a.length][a[0].length];
        for(int i = 0; i < summedUpMatrix.length; i++) {
            for(int j = 0; j < summedUpMatrix[0].length; j++) {
                summedUpMatrix[i][j] = a[i][j] + b[i][j];
            }
        }
        return summedUpMatrix;
    }

    public void printed2dArray(int[][] summedUpArray) {
        for (int i = 0; i < summedUpArray.length; i ++) {
            for(int j = 0; j < summedUpArray[0].length; j++) {
                System.out.println(summedUpArray[i][j]);
            }
        }
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
	    ArrayList<String> testArrayList = new ArrayList<>();
        testArrayList.add(0, "a");
        testArrayList.add(1, "apple");
        testArrayList.add(2, "dog");

        ArrayList<String> testArrayListTwo = new ArrayList<>();
        testArrayListTwo.add(0, "a");
        testArrayListTwo.add(1, "xyz");
        testArrayListTwo.add(2, "a");
        testArrayListTwo.add(3, "kite");
        testArrayListTwo.add(4, "xyz");

        //ArrayList<String> removedDuplicatesArrayList = solution.removeDuplicates(testArrayListTwo);
        ArrayList<Integer> scoreCard = solution.countNeedles(testArrayList, testArrayListTwo);
        //solution.printItemsInArrayList(scoreCard);

        A test = new AB(4);
        //System.out.println(test.getMessage());

        int i = 6;
        int j = 10;
        j+=i;
        //System.out.println(j);

        Item i1 = new Item(50);
        Item i2 = new Item(50);
       // System.out.println(i1 == i2); // references the same object, but it doesn't -> false

        //solution.fn();
        List<Integer> aList = new ArrayList<Integer>();
        for (int k = 11; k < 15; k++) {
            aList.add(k);
        }
        aList.add(1, 10);
        aList.remove(0);
        //System.out.println(aList.get(0));
        for (Integer number : aList) { // Not storing the value
            number = number + 1;
        }
        //System.out.println(aList.get(1));

        //solution.printSomething();

        //Unknown unknown = new Unknown();
        //System.out.println(unknown);

        RGB c1 = new RGB (255, 0, 255);
        RGB c2 = new RGB (255, 0, 255);

        boolean b2 = (c1 == c2);
        //System.out.println(b2);

        RGB alpha = new RGB(127, 127, 127);
        RGB beta = alpha;
        beta.set(255, 255, 255);
        beta = new RGB(0, 0, 0);
       // System.out.println(alpha);

        RGB gamma = new RGB(63, 63, 63);
        RGB delta = gamma;
        delta = new RGB(7, 7, 7);
        delta.set(95, 95, 95);
       // System.out.println(gamma);

        int[][] a = {{1, 3}, {1,0}, {1,2}};
        int[][] b = {{0,0}, {7, 5}, {2, 1}};
        int[][] summedArray = solution.addMatrices(a,b);
        //solution.printed2dArray(summedArray);

        int[] fib = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55};
        for(int r = 1; r < 5; r++) {
            fib[0] = fib[fib[r]];
            fib[fib[r]] = fib[r];
            fib[r] = fib[0];
        }
        System.out.println("fib[0] = " + fib[5]);
    }
}
