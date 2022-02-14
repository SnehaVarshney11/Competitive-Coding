class MinDistanceBetweenTwoNo {
    int minDist(int a[], int n, int x, int y) {
        // code here
        int ans = Integer.MAX_VALUE;
        int x_index = -1, y_index = -1;
        
        for(int i = 0; i < n; i++){
            if(a[i] == x){
                x_index = i;
            }
            if(a[i] == y){
                y_index = i;
            }
            
            if(x_index != -1 && y_index != -1){
                ans = Math.min(ans, Math.abs(x_index - y_index));
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
