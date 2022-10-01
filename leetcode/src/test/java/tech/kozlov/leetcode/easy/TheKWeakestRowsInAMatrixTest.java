package tech.kozlov.leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TheKWeakestRowsInAMatrixTest {

    @Test
    public void solutionTest() {

        TheKWeakestRowsInAMatrix resolver = new TheKWeakestRowsInAMatrix();

        assertArrayEquals(
                new int[]{2, 0, 3, 1, 4},
                resolver.kWeakestRows(
                        new int[][]{{1, 1, 0, 0, 0}, {1, 1, 1, 1, 0}, {1, 0, 0, 0, 0}, {1, 1, 0, 0, 0}, {1, 1, 1, 1, 1}}, 5
                )
        );

    }
}
