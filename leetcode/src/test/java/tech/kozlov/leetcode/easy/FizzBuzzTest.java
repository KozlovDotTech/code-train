package tech.kozlov.leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void solutionTest() {

        FizzBuzz resolver = new FizzBuzz();
        List<String> res1 = List.of("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz");
        assertEquals(res1, resolver.fizzBuzz(15));


    }
}
