package September;

import java.util.Arrays;

class SmallestSubsetWithGreaterSum {
    int minSubset(int[] Arr,int N) { 
        long sum=0;

     for(int i=0;i<Arr.length;i++)

     sum+=Arr[i];

     

     Arrays.sort(Arr);

     long curr=0;

     int cnt=0;

     for(int j=Arr.length-1;j>=0;j--)

     {

         curr+=Arr[j];

         if(curr>(sum-curr))

         break;

         cnt++;

     }

     return cnt+1;
    }
}
