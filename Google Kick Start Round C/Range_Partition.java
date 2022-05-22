import java.util.Scanner;
public class Range_Partition{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int T = 1; T <= t; T++){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            x = x + y;
            int cur = 0;
            int sum = (n * (n+1))/2;
            
            if((sum%x) == 0){
                System.out.println("Case #" + T + ":" + " POSSIBLE");
                x = sum/x;
                y = x*y;
                sum = n;
                
                int[] ar = new int[sum+3];
                for(int i = 1; i <= sum; i++){
                    if(i >= 1){
                        ar[i-1] = i;
                    }
                }
                for(int i = sum-1; i>= 0; i--){
                    if(ar[i] <= y){
                        y = y - ar[i];
                        ar[i] = 0;
                    }
                    
                }
                for(int a : ar){
                    if(a != 0){
                        ++cur;
                    }
                }
                System.out.println(cur);
                for(int i = 0; i < sum; i++){
                    if(ar[i] > 0 || ar[i] < 0){
                        System.out.print(i+1 + " ");
                    }
                }
                System.out.println();
            }else{
                System.out.println("Case #" + T + ":" + " IMPOSSIBLE");
            }
            sc.close();
        }
    }
}