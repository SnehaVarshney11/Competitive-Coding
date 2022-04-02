import java.util.Scanner;

class Chef_Goes_Shopping{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] left = new int[n]; //number of coins required to remove the ingredient from the left of an ingredient.
            int[] right = new int[n]; //number of coins required to remove the ingredient from the right of an ingredient.
            for(int i = 0; i < n; i++){
                left[i] = sc.nextInt();
            }
            for(int i = 0; i < n; i++){
                right[i] = sc.nextInt();
            }
            int[] al1 = new int[n];
            int[] al2 = new int[n];
            al2[n-1] = 0;
            for(int i = n-2; i >= 0; i--){
                al2[i] = Math.min(right[i], left[i+1]) + al2[i+1];
            }
            al1[0] = 0;
            for(int i = 1; i < n; i++){
                al1[i] = Math.min(right[i-1], left[i]) + al1[i-1];
            }
            int count = Math.min(al2[0], al1[n-1]);
            for(int i = 1; i+1 < n; i++){
                count = Math.min(count, al1[i-1] + al2[i+1] + left[i] + right[i]);
            }
            System.out.println(count);
            sc.close();
        }
    }
}