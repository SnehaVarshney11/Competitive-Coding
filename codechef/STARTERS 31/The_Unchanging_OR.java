import java.util.Scanner;

class The_Unchanging_OR{
    static boolean isPowerOfTwo(int n)
    {
        return (int)(Math.ceil((Math.log(n) / Math.log(2))))
            == (int)(Math.floor(((Math.log(n) / Math.log(2)))));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int temp = n; //check
            int count = 0;
            while(temp != 0){
                temp = temp/2;
                count++;
            }
            if(isPowerOfTwo(n)){
                System.out.println(n-count);
            }else{
                System.out.println(n-count);
            }
        }
    }
}