class MissingNumberInArray {
    int MissingNumber(int array[], int n) {
        // Your Code Here
        n=(n*(n+1))/2;//sum of n natural numbers
        int sum=0;
        //sum of array elements
        for(int i=0;i<array.length;i++)
        {
            sum+=array[i];
        }
        return n-sum;
    }
}
