package tech.kozlov.leetcode.easy;

import java.util.Map;

public class RomanToInteger {

    /*
     * soulution 1 (bad)
     */
    private final Map<String, Integer> integerValueBySingleRomanKey = Map.of(
            "I", 1,
            "V", 5,
            "X", 10,
            "L", 50,
            "C", 100,
            "D", 500,
            "M", 1000);

    private final Map<String, Integer> integerValueByDoubleRomanKey = Map.of(
            "IV", 4,
            "IX", 9,
            "XL", 40,
            "XC", 90,
            "CD", 400,
            "CM", 900);

    public int romanToIntBad(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.length() - i >= 2) {
                String subTwoSymbols = s.substring(i, i + 2);
                Integer inc = integerValueByDoubleRomanKey.get(subTwoSymbols);
                if (inc != null) {
                    result += inc;
                    i++;
                    continue;
                }
            }
            String subOneSymbol = Character.toString(s.charAt(i));
            result += integerValueBySingleRomanKey.get(subOneSymbol);
        }
        return result;
    }

    /*
     * solution 2 middle
     */
    private final String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
    private final int[] numerics = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

    public int romanToIntMiddle(String s) {
        int result = 0;
        int i = 0;
        while (i < 13 && s.length() > 0) {
            if (s.startsWith(symbols[i])) {
                s = s.substring(symbols[i].length());
                result += numerics[i];
            } else {
                i++;
            }
        }
        return result;
    }

    /*
     * solution 3
     */
    private final Map<Character, Integer> integerValueBySingleRomanChar = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000);


    public int romanToInt(String s) {
        int result = 0;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            if (i < length - 1 && integerValueBySingleRomanChar.get(s.charAt(i + 1)) > integerValueBySingleRomanChar
                    .get(s.charAt(i))) {
                result = result + integerValueBySingleRomanChar.get(s.charAt(i + 1))
                        - integerValueBySingleRomanChar.get(s.charAt(i));
                i++;
            } else {
                result += integerValueBySingleRomanChar.get(s.charAt(i));
            }
        }
        return result;
    }
}
