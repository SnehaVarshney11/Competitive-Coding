package September;

class SortAnArray {
    public static void sort012(int a[], int n)
    {
        // code here 
        int oc = 0;
        int tc = 0;
        
        for(int k=0; k<a.length; k++){
            //count no of one's
            if(a[k]==1)
                oc++;
            //count no of two's
            else if(a[k]==2)
                tc++;
            a[k]=0;
        }
        int x = n - oc - tc;
        for(int i=x; i<n; i++){
            //update the current the element as 1 until one's counter is greater than zero
            if(oc>0){
                a[i]=1;
                //decrement one's counter after updating current element as 1
                oc--;
            }
            else
                //if one's counter reaches zero then the remaining elements should be 2's
                a[i]=2;
        }
    }
}
