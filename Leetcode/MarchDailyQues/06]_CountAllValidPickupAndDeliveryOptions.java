package MarchDailyQues;

class CountAllValidPickupAndDeliveryOptions {
    public int countOrders(int n) {
        long res = 1, modulo = 1000000007;
        for(int i=1; i<=n; i++){
            res = res * i * (2*i - 1) % modulo;
        }
        return (int)res;
    }
}
