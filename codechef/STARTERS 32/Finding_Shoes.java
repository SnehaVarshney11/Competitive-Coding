import java.util.Scanner;

class Finding_Shoes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt(); //Number of chef's friends
            int m = sc.nextInt(); //the number of left shoes Chef has
            int right = 0;
            if(m >= n){
                right = n;
            }else if(m < n){
                right = 2*n-m;
            }
            System.out.println(right);
        }
    }
}