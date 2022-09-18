package Leetcode.SepDailyQues;

class TrappingRainWater {
    public int trap(int[] height) {
        int size = height.length;
       
        int maxl[] = new int[size];
        int maxr[] = new int[size];
        for(int i=0; i<size; i++){
            maxl[0] = height[0];
            maxr[size-1] = height[size-1];
        }
        for(int i=1; i<size; i++)
        {
            maxl[i] = Math.max(maxl[i-1],height[i]);
        }
          
        for(int i=size-2; i>=0; i--)
        {
            maxr[i] = Math.max(maxr[i+1],height[i]);
        }
        int water[] = new int[size];
        for(int i=0; i<size; i++)
        {
            water[i] = Math.min(maxl[i],maxr[i])-height[i];
        }
        int sum=0;
        for(int i=0; i<size; i++)
        {
            sum = sum+water[i];
        }
        return sum;
    }
}
