package tech.kozlov.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RansomNoteTest {

    @Test
    public void solutionTest() {

        RansomNote resolver = new RansomNote();


        assertFalse(resolver.canConstruct("a", "b"));
        assertFalse(resolver.canConstruct("aa", "ab"));
        assertTrue(resolver.canConstruct("aa", "aab"));

    }
}
