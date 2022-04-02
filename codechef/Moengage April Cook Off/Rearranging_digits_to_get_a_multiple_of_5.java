import java.util.Scanner;

//  Code By Sneha Varshney
class Rearranging_digits_to_get_a_multiple_of_5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // No of test cases
        while(t-->0){
            int n = sc.nextInt(); // no of digits
            String str = sc.next();
            boolean flag = false;
            for(int i = 0; i < n; i++){
                if(str.charAt(i) == '0' || str.charAt(i) == '5'){
                    flag = true;
                    break;
                }
            }
            if(flag){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            sc.close();
        }
    }
}