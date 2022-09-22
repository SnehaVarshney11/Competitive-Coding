package September;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class IPL2021 {
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        // Your code here
        ArrayList<Integer> ans = new ArrayList<>();

        List<Integer> ar = new LinkedList<>();  
        
        int max = Integer.MIN_VALUE;    
        
        for(int i=0; i<k; i++) {    
            if(arr[i]>max)  max = arr[i];   
            ar.add(arr[i]); 
        }   
        
        ans.add(max);   
        
        for(int i=k; i<n; i++) {    
            if(ar.get(0)!=max && max>=arr[i]) { 
                ar.remove(0);   
                ans.add(max);   
                ar.add(arr[i]); 
            }   
            else if(ar.get(0)!=max && max<arr[i]) { 
                ar.remove(0);   
                ar.add(arr[i]); 
                max = arr[i];   
                ans.add(max);   
            }   
            else {  
                ar.remove(0);   
                ar.add(arr[i]); 
                max = Collections.max(ar);  
                ans.add(max);   
            }   
        }   
        
        return ans;
    }
}
