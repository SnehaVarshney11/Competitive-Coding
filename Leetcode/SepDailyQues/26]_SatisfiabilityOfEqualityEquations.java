package Leetcode.SepDailyQues;

class SatisfiabilityOfEqualityEquations {
    int[] ar = new int[26];
    public boolean equationsPossible(String[] equations) {
        for (int i = 0; i < 26; ++i) ar[i] = i;
        for (String e : equations)
            if (e.charAt(1) == '=')
                ar[find(e.charAt(0) - 'a')] = find(e.charAt(3) - 'a');
        for (String e : equations)
            if (e.charAt(1) == '!' && find(e.charAt(0) - 'a') == find(e.charAt(3) - 'a'))
                return false;
        return true;
    }

    public int find(int x) {
        if (x != ar[x]) ar[x] = find(ar[x]);
        return ar[x];
    }
}
