package Love_Babbar_Cheat_Sheet.Array;

class MinimumNmberOfJumps {
    public int jump(int[] nums) {
        int sc = 0;
        int e = 0;
        int max = 0;
        for(int i=0; i<nums.length-1; i++) {
            max = Math.max(max, i+nums[i]);
            if( i == e ) {
                sc++;
                e = max;
            } 
        }
        return sc;
    }    
}
