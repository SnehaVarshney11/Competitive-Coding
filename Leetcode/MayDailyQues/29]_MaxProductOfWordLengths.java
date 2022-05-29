package Leetcode.MayDailyQues;

class MaximumProductOfWordLengths{
    public int maxProduct(String[] words) {
        int[] bit = new int[words.length];
        for (int i = 0;i < words.length; i++) {
            int check = 0;
            for (int j = 0; j < words[i].length(); j++) {
                check |= 1 << (words[i].charAt(j) - 'a'); // store in bit like for 1 it will 1 and for 2 it will be 10 likewise
            }
            bit[i] = check;
        }
        int res = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++)
                if ((bit[i] & bit[j]) == 0) // if no bits are equal then it will be 0
                    res = Math.max( words[i].length() * words[j].length(), res);
        }
        return res;
    }
}