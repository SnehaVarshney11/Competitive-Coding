package October;

import java.util.HashMap;

class MaximizeTheSumOfSelectedNumbers {
    public static int maximizeSum (int arr[], int n) {
        //Complete the function
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){

            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);

        }

        

        int res = 0;

        for(int i=n-1; i>=0; i--){

            if(map.get(arr[i])!=0){

                res+=arr[i];

                map.put(arr[i], map.get(arr[i])-1);

                if(map.getOrDefault(arr[i]-1, 0)!=0){

                    map.put((arr[i]-1), map.get(arr[i]-1)-1);

                }

            }

        }

        return res;
    }
}
