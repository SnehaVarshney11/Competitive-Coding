//  Code By Sneha Varshney
import java.util.Scanner;

class Important_Pages_on_CodeChef{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); // user has submitted on the practice page
        int B = sc.nextInt(); // user has participated in a contest

        if(A == 1 && B == 1){
            System.out.println("https://discuss.codechef.com");
        }else if(A == 0){
            System.out.println("https://www.codechef.com/practice");
        }else{
            System.out.println("https://www.codechef.com/contests");
        }
        sc.close();
    }
}