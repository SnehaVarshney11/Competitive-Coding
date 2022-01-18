import java.util.ArrayList;

class SubarrayWithGivenSum {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        int start = 0, end = 0;
        boolean flag = false;
        int cursum = 0;
        
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i = 0; i < n; i++){
            cursum += arr[i];
            if(cursum >= s){
                end = i;
                
                while(s < cursum && start < end){
                    cursum -= arr[start];
                    ++start;
                }
                if(cursum == s){
                    al.add(start + 1);
                    al.add(end + 1);
                    
                    flag = true;
                    break;
                }
            }
        }
        if(flag == false){
            al.add(-1);
        }
        return al;
    }    
}
