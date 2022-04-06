import java.util.Scanner;

class Distinct_Dilemma{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt(); //size of array
            int[] ar = new int[n];
            int sum = 0;
            for(int i = 0; i < n; i++){
                ar[i] = sc.nextInt();
                sum += ar[i];
            }
            int count = 1, res = 0;
            while(sum > 0){
                sum -= count;
                res += 1;
                count += 1;
            }
            if(sum < 0){
                System.out.println(res-1);
            }else{
                System.out.println(res);
            }
            sc.close();
        }
    }
}