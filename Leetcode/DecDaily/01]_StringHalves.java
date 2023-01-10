package Leetcode.DecDaily;

import java.util.Set;

class StringHalves {
    public boolean halvesAreAlike(String s) {
        Set<Character> set = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        int cnt = 0, in = s.length() / 2;

        for (int i = 0; i < in; i++) {
            char charA = s.charAt(i);
            char charB = s.charAt(in + i);
            if (set.contains(charA)) cnt++;
            if (set.contains(charB)) cnt--;
        }
        
        return cnt == 0;
    }
}
