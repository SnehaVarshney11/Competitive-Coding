import java.util.Scanner;

class Chef_and_Cook_Off{
    public static void main(String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        sc.close();
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            int count_one = 0;
            for(int j = 0; j < 5; j++){
                if(sc.nextInt() == 1){
                    count_one++;
                }
            }
            if(count_one == 0)
                    System.out.println("Beginner");
                else if(count_one == 1)
                    System.out.println("Junior Developer");
                else if(count_one == 2)
                    System.out.println("Middle Developer");
                else if(count_one == 3)
                    System.out.println("Senior Developer");
                else if(count_one == 4)
                    System.out.println("Hacker");
                else
                    System.out.println("Jeff Dean");
        }
    }
}