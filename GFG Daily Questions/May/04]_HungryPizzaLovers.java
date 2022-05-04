package GFG Daily Questions.May;

class HungryPizzaLovers {
    public static ArrayList<Integer> permute (int arr[][], int n) {
        //Complete the function
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0; i < n; i++){
            arr[i][0] = arr[i][0] + arr[i][1];
            arr[i][1] = i+1;
        }
        Arrays.sort(arr, (a,b) -> a[0]-b[0]);
        
        for(int i = 0; i < n; i++){
            al.add(arr[i][1]);
        }
        return al;
    }
}
