package CodeForces.B;
import java.util.Scanner;

public class B_Even_Array{
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
            
            int odd = 0, even = 0;
            for(int i = 0; i < n; i++){
                if(i%2 != ar[i]%2){
                    if(ar[i]%2 == 1){
                        odd++;
                    }else{
                        even++;
                    }
                }
            }
            if(odd != even){
                System.out.println("-1");
            }else{
                System.out.println(even);
            }
        }
    }
}