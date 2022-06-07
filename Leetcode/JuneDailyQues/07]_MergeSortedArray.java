package Leetcode.JuneDailyQues;

class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int n1 = m-1, n2 = n-1, i = m+n-1;
        
        while(n2 >= 0){
            if(n1 >= 0 && nums1[n1] > nums2[n2]){
                nums1[i--] = nums1[n1--];
            }else{
                nums1[i--] = nums2[n2--];
            }
        }
    }
}
