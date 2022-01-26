import java.util.ArrayList;

class MaxAndSecondMax {
    public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[])
    {
        //code here.
        int first = -1, second = -1;
        for(int i = 0; i < sizeOfArray; i++){
            if(arr[i] > first){
                first = arr[i];
            }
        }
        for(int i = 0; i < sizeOfArray; i++){
            if(arr[i] > second && arr[i] < first){
                second = arr[i];
            }
        }
        ArrayList<Integer> al = new ArrayList<Integer>(2);
        al.add(first);
        al.add(second);
        return al;
    }
}
