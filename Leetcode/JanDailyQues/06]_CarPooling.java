package JanDailyQues;

class CarPooling {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] occupancy = new int[1001];
        for(int i = 0; i < trips.length; i++){
            occupancy[trips[i][1]] += trips[i][0];
            occupancy[trips[i][2]] -= trips[i][0];
        }
        int currCapacity = 0;
        for(int currOccupancy : occupancy){
            currCapacity += currOccupancy;
            if(currCapacity > capacity){
                return false;
            }
        }
        return true;
    }
}
