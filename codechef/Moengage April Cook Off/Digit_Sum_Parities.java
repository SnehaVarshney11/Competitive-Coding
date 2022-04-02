import java.util.Scanner;

class Digit_Sum_Parities{
    static int sumOfDigits(int n){
        int sum = 0;
        while(n > 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int sum = sumOfDigits(n);
            if(sum % 2 != 0){
                while(sum % 2 != 0){
                    n++;
                    sum = sumOfDigits(n);
                }
                System.out.println(n);
            }else{
                while(sum % 2 == 0){
                    n++;
                    sum = sumOfDigits(n);
                }
                System.out.println(n);
            }
            sc.close();
        }
    }
}