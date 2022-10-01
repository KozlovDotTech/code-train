package tech.kozlov.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class TheKWeakestRowsInAMatrix {

    public int[] kWeakestRows(int[][] mat, int k) {
        Set<Integer> weakestRows = new HashSet<>();
        int[] result = new int[k];
        int length = mat.length;
        int width =  mat[0].length;
        int pointer = 0;
        for (int j = 0; j < width; j++) {
            for (int i = 0; i < length; i++) {
                if (mat[i][j] == 0) {
                    if (weakestRows.add(i)) {
                        result[pointer++] = i;
                    }
                }
                if (pointer == k) return result;
            }
        }
        for (int i = 0; i < length; i++) {
            if (mat[i][width-1] == 1) {
                if (weakestRows.add(i)) {
                    result[pointer++] = i;
                }
            }
            if (pointer == k) return result;
        }
        return result;
    }
}
