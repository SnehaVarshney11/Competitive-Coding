package JanDailyQues;

class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count_zero = 1, res = 0;
        
        for(int i = 0; i < flowerbed.length; i++){
            if(flowerbed[i] == 0){
                ++count_zero;
            }else{
                res += (count_zero - 1)/2;
                count_zero = 0;
            }
        }
        return res + count_zero / 2 >= n;
    }
}
