package org.example;

public class Variant1 {
    static int integer1(int cm) {
        return cm / 100;
    }

    static public boolean boolean1(int a) {
        return a > 0;
    }

    static public int if1(int n) {
        if (n > 0) return  n + 1;
        return n;
    }

    static public String case1(int week) {
        return switch (week) {
            case 1 -> "Понеділок";
            case 2 -> "Вівторок:";
            case 3 -> "Середа";
            case 4 -> "Четвер";
            case 5 -> "П'ятниця";
            case 6 -> "Субота";
            case 7 -> "Неділя";
            default -> throw new IllegalArgumentException("week shoud be between 1 and 7");
        };
    }

    static public int[] for1(int k, int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = k;
        }

        return result;
    }

    static public int while1(int a, int b) {
        int count = 0;
        while (a > b) {
            a -= b;
            count++;
        }

        return count;
    }

    static public int[] minMax(int n, int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];

        for (int i = 0; i < n; i++) {
            min = numbers[i] < min ? numbers[i] : min;
            max = numbers[i] > max ? numbers[i] : max;
        }

        return new int[] {min, max};
    }

    static public int[] array1(int n) {
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = i*2 + 1;
        }

        return result;
    }

    static public int[][] matrix1(int m, int n) {
        int[][] result = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = i * 10;
            }
        }

        return result;
    }
}