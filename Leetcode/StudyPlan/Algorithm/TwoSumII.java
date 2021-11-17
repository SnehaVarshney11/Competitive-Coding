package StudyPlan.Algorithm;

class TwoSumII{
    public int[] twoSum(int[] numbers, int target) {
        int a = 0, b = numbers.length-1;
        
        while(a<=b){
            int sum = numbers[a]+numbers[b];
            if(sum>target){
                b = b-1;
            } else if(sum<target){
                a = a+1;
            } else{
                return new int[] {a+1,b+1};
            }
        }
        return new int[] {a+1,b+1};
    }
}