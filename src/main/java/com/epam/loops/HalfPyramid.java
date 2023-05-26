package com.epam.loops;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        for (int row = 1; row <= cathetusLength; row++)     // number of rows
        {
            for (int cnt = cathetusLength; cnt - row > 0; cnt--) // number of stars
                System.out.print(" ");
            for (int cnt = 1; cnt <= row; cnt++)
                System.out.print("*");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}