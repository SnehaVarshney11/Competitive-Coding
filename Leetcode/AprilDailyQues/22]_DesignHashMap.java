class DesignHashMap{
    int[] ar;
    public MyHashMap() {
        ar = new int[1000001];
        Arrays.fill(ar, -1);
    }
    
    public void put(int key, int value) {
        ar[key] = value;
    }
    
    public int get(int key) {
        return ar[key];
    }
    
    public void remove(int key) {
        ar[key] = -1;
    }
}