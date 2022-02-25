import java.util.Scanner;

class Non_Comprime_Neighbours{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] ar = new int[n];
            for(int i = 0; i < n; i++){
                ar[i] = sc.nextInt();
            }
            int i = 1, cur = 1;
            while(i <= n){
                if(cur != 0){
                    ar[i] = ar[i+1] * 2;
                    i += 2;
                }else{
                    ar[i] = ar[i-1] * 2;
                    i++;
                }
                cur = 1 - cur;
            }
            for(int j = 1; j <= n; j++){
                System.out.print(ar[j] + " ");
            }
        }
    }
}