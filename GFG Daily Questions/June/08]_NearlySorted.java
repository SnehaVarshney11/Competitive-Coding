package June;

import java.util.ArrayList;
import java.util.PriorityQueue;

class NearlySorted {
    ArrayList <Integer> nearlySorted(int arr[], int num, int k)
    {
        // your code here
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(k);
        ArrayList<Integer> al = new ArrayList<>();
        
        int i = 0, j = 0;
        while(i < num && j <= k){
            pq.add(arr[i++]);
            j++;
        }
        while(i < num){
            if(!pq.isEmpty()){
                al.add(pq.poll());
            }
            pq.add(arr[i++]);
        }
        while(!pq.isEmpty()){
            al.add(pq.poll());
        }
        return al;
    }
}
