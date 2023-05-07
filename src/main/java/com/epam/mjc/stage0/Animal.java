package com.epam.mjc.stage0;

public class Animal {

    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        return String.format("This animal is mostly %s." +
                " It has %d paw%s and %s" +
                " fur.", this.color, this.numberOfPaws, this.getNumberOfPaws(), this.getHasFur(hasFur));
    }

    private String getHasFur(boolean hasFur) {
        return hasFur ? "a" : "no";
    }

    private String getNumberOfPaws() {
        return numberOfPaws > 1 ? "s" : "";
    }

}
