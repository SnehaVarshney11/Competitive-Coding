package Leetcode.SepDailyQues;

import java.util.Arrays;

class TheNumberOfWeakCharactersInTheGame {
    public int numberOfWeakCharacters(int[][] properties) {
        if (properties.length == 0 || properties.length == 0) {
            return 0;
        }
        
        Arrays.sort(properties, (property1, property2) -> property1[0] != property2[0] ?Integer.compare(property2[0], property1[0]) : Integer.compare(property1[1], property2[1]));
        int max = Integer.MIN_VALUE;
        int count = 0;
        for (int [] property : properties) {
            if (max > property[1]) {
                count++;
            }
            max = Math.max(max, property[1]);
        }
        return count;
    }
}
