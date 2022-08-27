package August;

class AlternatePositiveAndNegativeNumbers {
    void rearrange(int arr[], int n) {
       
        //count total number of +ve, -ve numbers
        int positiveLen=0,negativeLen=0;
        
        for(int i=0; i<n; i++){
            if(arr[i]>=0){
                positiveLen++;
            }
            else{
                negativeLen++;
            }
        }
        
        //store +ve, -ve elements from arr[] to respective new arrays
        int[] positiveArr=new int[positiveLen];
        int[] negativeArr=new int[negativeLen];
        int positiveI=0, negativeI=0;
        
        for(int i=0; i<n; i++){
            if(arr[i]>=0){
                positiveArr[positiveI]=arr[i];
                positiveI++;
            }
            else{
                negativeArr[negativeI]=arr[i];
                negativeI++;
            }
        }
        
        //altering values of arr[]
        int posI=0, negI=0, i=0;
        while(i<n){
            if(posI<positiveI){
                arr[i]=positiveArr[posI];
                posI++;
                i++;
            }
            if(negI<negativeI){
                arr[i]=negativeArr[negI];
                negI++;
                i++;
            }
        }
    }
}
