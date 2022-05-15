import java.util.ArrayList;
import java.util.Arrays;

class UniqueSubsets {
    //Function to find all possible unique subsets.
    public static ArrayList <ArrayList <Integer>> AllSubsets(int arr[], int n)
    {
        // your code here
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        getSet(arr,new ArrayList<Integer>(),n,ans,0);
        ans.remove(0);
        return ans;
    }
    public static void getSet(int []arr,ArrayList<Integer> ls,int n,ArrayList<ArrayList<Integer>> ans,
    int ind){
        ans.add(new ArrayList<>(ls));
        for(int i=ind;i<n;i++){
            if(i!=ind&&arr[i]==arr[i-1]) continue;
            ls.add(arr[i]);
            getSet(arr,ls,n,ans,i+1);
            ls.remove(ls.size()-1);
        }
    }
}
