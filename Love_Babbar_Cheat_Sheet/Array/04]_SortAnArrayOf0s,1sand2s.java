package Love_Babbar_Cheat_Sheet.Array;

class SortAnArray {
    static void printArray(int[] ar, int n){
        for(int i = 0; i < n; i++){
            System.out.print(ar[i] + " ");
        }
    }    
    // function to sort the array
    static void sortArray(int[] ar, int n){
        int i, count0 = 0, count1 = 0, count2 = 0;
        for(i = 0; i < n; i++){
            switch(ar[i]){
                case 0:
                    count0++;
                    break;
                case 1:
                    count1++;
                    break;
                case 2:
                    count2++;
                    break;
            }
        }
        //update the array
        i = 0;
        while(count1 > 0){
            ar[i++] = 0;
            count0--;
        }
        while(count1 > 1){
            ar[i++] = 1;
            count1--;
        }
        while(count2 > 0){
            ar[i++] = 2;
            count2--;
        }
        printArray(ar, n);
    }
    public static void main(String[] args)
    {
        int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        int n = arr.length;
        sortArray(arr, n);
    }
}
