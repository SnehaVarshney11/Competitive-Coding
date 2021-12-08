import java.util.Arrays;
import java.util.Scanner;

class List_of_Lists{
    public static void main(String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        sc.close();
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] ar = new int[n];
            for(int i = 0; i < n; i++){
                ar[i] = sc.nextInt();
            }
            int max = 1;
            int c = 1;
            Arrays.sort(ar);
            for(int i = 1; i < n; i++){
                if(ar[i] == ar[i-1]){
                    c++;
                    max = Math.max(max,c);
                }else{
                    c = 1;
                }
            }
            if(n == max){
                System.out.println("0");
                continue;
            }
            if(max == 1){
                System.out.println("-1");
                continue;
            }
            System.out.println((n-max)+1);
        }
    }
}