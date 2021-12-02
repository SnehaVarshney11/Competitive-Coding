package Love_Babbar_Cheat_Sheet.Array;

class MoveNumbers {
    static void moveNum(int[] ar, int n){
        int temp, j = 0;
        for(int i = 0; i < n; i++){
            if(ar[i] < 0){
                temp = ar[i];
                ar[i] = ar[j];
                ar[j] = temp;
            }
            j++;
        }
    }   
    static void printArray(int[] ar, int n){
        for(int i = 0; i < n; i++){
            System.out.print(ar[i] + " ");
        }
    }
    public static void main(String[] args){
        int[] ar = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
        int n = ar.length;

        moveNum(ar, n);
        printArray(ar, n);
    } 
}
