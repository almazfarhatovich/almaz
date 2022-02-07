package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Class klass = new Class(11,"B", new int[]{3554, 99});
        System.out.print(klass.getNumber()+" "+ klass.getWord()+" ");
        klass.getMassive();
    }
}
