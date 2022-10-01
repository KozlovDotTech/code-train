package tech.kozlov.leetcode.easy;

import java.util.LinkedList;
import java.util.List;

public class FizzBuzz {

    public List<String> fizzBuzz(int n) {

        int counter5 = 1;
        int counter3 = 1;
        List<String> result = new LinkedList<>();

        for (int i = 0; i < n; i++, counter3++, counter5++) {
            if (counter5 == 5 && counter3 == 3) {
                String divisibleBy5and3 = "FizzBuzz";
                result.add(divisibleBy5and3);
                counter3 = 0;
                counter5 = 0;
            } else if (counter3 == 3) {
                String divisibleBy3 = "Fizz";
                result.add(divisibleBy3);
                counter3 = 0;
            } else if (counter5 == 5) {
                String divisibleBy5 = "Buzz";
                result.add(divisibleBy5);
                counter5 = 0;
            } else {
                result.add(String.valueOf(i + 1));
            }
        }
        return result;
    }
}
