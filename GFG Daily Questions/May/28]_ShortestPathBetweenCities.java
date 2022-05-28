package May;

class ShortestPathBetweenCities {
    int shortestPath( int x, int y){ 
        // code here
        int ans = 0;
        while(x != y){
            if(x > y){
                x /= 2;
            }else{
                y /= 2;
            }
            ans++;
        }
        return ans;
    }
}
