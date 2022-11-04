package Leetcode.NovemberDaily;

class ReverseVowels {
    public String reverseVowels(String s) {
        int j = 0;
        char[] str = s.toCharArray();
        String vowel = "";
        for (int i = 0; i < str.length; i++) {
            if (str[i] == 'a' || str[i] == 'A' || str[i] == 'e'
                    || str[i] == 'E' || str[i] == 'i' || str[i] == 'I'
                    || str[i] == 'o' || str[i] == 'O' || str[i] == 'u'
                    || str[i] == 'U') {
                j++;
                vowel += str[i];
            }
        }
        for (int k = 0; k < str.length; k++) {
            if (str[k] == 'a' || str[k] == 'A' || str[k] == 'e'
                    || str[k] == 'E' || str[k] == 'i' || str[k] == 'I'
                    || str[k] == 'o' || str[k] == 'O' || str[k] == 'u'
                    || str[k] == 'U') {
                str[k] = vowel.charAt(--j);
            }
        }
        return String.valueOf(str);
    }
}
