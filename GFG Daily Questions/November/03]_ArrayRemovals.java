package November;

import java.util.Arrays;

class ArrayRemovals {
    int removals(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);

        int i=0,j=0;

        int ans=0;

        while(j<n)

        {

            while(arr[j]-arr[i]>k)

            {

                i++;

            }

            j++;

            ans=Math.max(ans,j-i);

        }

        return n-ans;
    }
}
