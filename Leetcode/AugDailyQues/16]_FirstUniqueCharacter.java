package Leetcode.AugDailyQues;

class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        for(char c : s.toCharArray()){
            int index1 = s.indexOf(c);
            int index2 = s.lastIndexOf(c);
            if(index1 == index2)
                return index1;
        }
        return -1;
    }
}
