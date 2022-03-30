import java.util.Scanner;

class Course_Registration{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt(); //size of friend group
            int m = sc.nextInt(); // capacity of course
            int k = sc.nextInt(); //the number of students already registered for the course

            if((n+k) <= m){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}