import java.util.ArrayList;
import java.util.List;

class ArrayToBST {
    public int[] sortedArrayToBST(int[] nums)
    {
        // Code here 
        List<Integer> ls=new ArrayList<>();
        getBST(ls,nums,0,nums.length-1);
        return ls.stream().mapToInt(i->i).toArray();
    }
    public void getBST(List<Integer> ls,int[]nums,int left,int right){
        if(right<left) return;
        int mid=left+(right-left)/2;
        ls.add(nums[mid]);
        getBST(ls,nums,left,mid-1);
        getBST(ls,nums,mid+1,right);
    }
}
