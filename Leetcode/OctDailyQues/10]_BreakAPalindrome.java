package Leetcode.OctDailyQues;

class BreakAPalindrome {
    public String breakPalindrome(String palindrome) {
        if (palindrome.length() <= 1) {
            return "";
        }
        char[] a = palindrome.toCharArray();

        for (int i = 0; i < a.length / 2; i++) {
            if (a[i] != 'a') {
                a[i] = 'a';
                return new String(a);
            }
        }

        a[a.length - 1] = 'b';
        return new String(a);
    }
}
