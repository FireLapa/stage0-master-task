package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int revers = 0;
        while(number != 0) {
            int digit = number % 10;
            revers = revers * 10 + digit;

            number /= 10;
        }

        System.out.println(revers);
    }

}
