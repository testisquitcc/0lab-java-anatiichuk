package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(Arrays.toString(Arrays.stream(Variant1.array1(5)).toArray()));

    }
}