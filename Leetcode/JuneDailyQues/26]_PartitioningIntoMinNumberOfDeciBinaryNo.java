package Leetcode.JuneDailyQues;

class PartitioningIntoMinNumberOfDeciBinaryNo {
    public int minPartitions(String n) {
        int max = 0;
        for(int i = 0; i < n.length(); i++){
            if(n.charAt(i) > max){
                max = n.charAt(i);
            }
        }
        return max - '0';
    }
}
