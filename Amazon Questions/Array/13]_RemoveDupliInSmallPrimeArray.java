import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

class RemoveDupliInSmallPrimeArray {
    ArrayList<Integer> removeDuplicate(int arr[], int n)
    {
        // code here 
        Set<Integer> set = new LinkedHashSet<Integer>();
        for(int i : arr){
            set.add(i);
        }
        return new ArrayList<>(set);
    }
}
