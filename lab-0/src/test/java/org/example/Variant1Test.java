package org.example;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.*;

public class Variant1Test {

    @Test
    public void testInteger1() {
        var actual = Variant1.integer1(5432);
        var expected = 54;
        assertEquals(actual, expected);
    }

    @Test
    public void testBoolean1_true() {
        assertTrue(Variant1.boolean1(5));
    }


    @Test
    public void testBoolean1_false() {
        assertFalse(Variant1.boolean1(-5));
    }

    @Test
    public void testIf1() {
        var actual = Variant1.if1(9);
        var expected = 10;
        assertEquals(actual, expected);
    }

    @Test
    public void testIf2() {
        var actual = Variant1.if1(1);
        var expected = 2;
        assertEquals(actual, expected);
    }

    @Test
    public void testIf3() {
        var actual = Variant1.if1(0);
        var expected = 0;
        assertEquals(actual, expected);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testCase1() {
       var res = Variant1.case1(0);
    }

    @Test
    public void testCase2() {
        var actual = Variant1.case1(1);
        var expected = "Понеділок";
        assertEquals(actual, expected);
    }

    @Test
    public void testCase3() {
        var actual = Variant1.case1(6);
        var expected = "Субота";
        assertEquals(actual, expected);
    }


    @Test
    public void testFor1() {
        var actual = Variant1.for1(10,5);
        var expected = new int[] {10, 10, 10, 10, 10};
        assertEquals(actual,expected);
    }

    @Test
    public void testWhile1() {
        var actual = Variant1.while1(10, 3);
        var expected = 3;
        assertEquals(actual, expected);
    }

    @Test
    public void testMinMax() {
        var actual = Variant1.minMax(10, new int[] {1, 3, 5, 7, 9, 10, 8, 6, 4, 2});
        var expected = new int[] {1, 10};
        assertEquals(actual, expected);
    }

    @Test
    public void testArray1() {
        var actual = Variant1.array1(5);
        var expected = new int[] {1, 3, 5, 7, 9};
        assertEquals(actual, expected);
    }

    @Test
    public void testMatrix1() {
        var actual = Variant1.matrix1(3, 4);
        var expected = new int[][] {
                {0, 0, 0, 0},
                {10, 10, 10, 10},
                {20, 20, 20, 20}
        };

        assertTrue(Arrays.deepEquals(actual, expected));
    }
}