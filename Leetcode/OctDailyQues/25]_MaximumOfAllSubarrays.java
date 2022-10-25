package Leetcode.OctDailyQues;

import java.util.ArrayList;

class MaximumOfAllSubarrays {
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        // Your code here
        ArrayList<Integer> a = new ArrayList<Integer>();

        for(int i=0;i<=n-k;i++)

        {

            int max =0;

            for(int j=i;j<k+i;j++)

            {

                if(arr[j]>max)

                max = arr[j];

            }

            a.add(max);

        }

        return a;

        
    }
}
