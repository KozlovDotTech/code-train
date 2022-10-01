package tech.kozlov.leetcode.easy;

import java.util.HashMap;

public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> charsCount = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            Integer curCount = charsCount.get(magazine.charAt(i));
            if (curCount == null) curCount = 0;
            charsCount.put(magazine.charAt(i), ++curCount);
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            Integer curCount = charsCount.get(ransomNote.charAt(i));
            if (curCount == null) curCount = 0;
            charsCount.put(ransomNote.charAt(i), --curCount);
        }
        for (Integer val: charsCount.values()) {
            if (val < 0) return false;
        }
        return true;
    }
}
