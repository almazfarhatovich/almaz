package com.company;

import java.util.Arrays;
import java.util.List;

import static java.util.List.*;

public class Class {
    private int number;
    private String word;
    private int[] massive;

    public Class() {
    }

    public Class(int number, String word, int[] massive) {
        this.number = number;
        this.word = word;
        this.massive = massive;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int[] getMassive() {
        for (int san : massive) {
            System.out.print(san + " ");
        }
        return massive;
    }

    public void setMassive(int[] massive) {
        this.massive = massive;
    }
}
