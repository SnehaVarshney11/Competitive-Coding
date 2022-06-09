package June;

class UnionFind{
    public int get_par(int[] arr,int val){
        while(arr[val]!=val)
            val = arr[val];
        return val;
     }
     //Function to merge two nodes a and b.
     public void union_(int a, int b, int par[], int rank[])
     {
         // add your code here
          par[get_par(par,b)] = get_par(par,a);
     }
 
     //Function to check whether 2 nodes are connected or not.
     public Boolean isConnected(int a, int b, int par[], int rank[])
     {
         // add your code here
         return get_par(par,a)==get_par(par,b);
     }
}