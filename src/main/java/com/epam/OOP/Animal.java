package com.epam.OOP;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;
    public Animal (String color, int numberOfPaws,boolean hasFur) {

        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        String pawcount;
        String fur;
        if (this.numberOfPaws == 1) {
            pawcount = " paw";
        } else {
            pawcount = " paws";
        }
        if (this.hasFur == true) {
            fur = "a";
        } else {
            fur = "no";
        }
        return "This animal is mostly " + this.color + ". It has " + this.numberOfPaws + pawcount + " and " + fur + " fur.";
    }
}
