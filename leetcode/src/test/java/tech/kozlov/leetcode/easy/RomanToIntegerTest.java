package tech.kozlov.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanToIntegerTest {

    @Test
    public void solutionTest() {

        RomanToInteger resolver = new RomanToInteger();

        String testCase1 = "III";
        String testCase2 = "LVIII";
        String testCase3 = "MCMXCIV";

        assertEquals(3, resolver.romanToInt(testCase1));
        assertEquals(58, resolver.romanToInt(testCase2));
        assertEquals(1994, resolver.romanToInt(testCase3));

    }
}
