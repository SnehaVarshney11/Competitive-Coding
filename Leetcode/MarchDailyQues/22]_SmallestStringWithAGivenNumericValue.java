package MarchDailyQues;

class SmallestStringWithAGivenNumericValue{
    public String getSmallestString(int n, int k) {
        char[] result = new char[n];
        for (int i = 0; i < n; i++) {
            result[i] = 'a';//initialize all array element with 'a'
            k--;
        }
        int numValue;
        while (k > 0) {
            numValue = Math.min(25, k);//building the string from the end to the beginning, it will always be optimal.
            result[--n] += numValue;
            k -= numValue;
        }
        return String.valueOf(result);
    }
}