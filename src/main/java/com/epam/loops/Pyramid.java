package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            for (int a = i; a < cathetusLength; a++) {
                System.out.print(" ");
            }
            for (int b = i; b > 0; b--) {
                System.out.print(b);
            }
            for (int c = 2; c <= i; c++) {
                System.out.print(c);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
