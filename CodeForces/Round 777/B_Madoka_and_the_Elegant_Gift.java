import java.util.Scanner;

public class B_Madoka_and_the_Elegant_Gift{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            char[][] ar = new char[n][m];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    System.out.println(ar[i][j]);
                }
            } 
            boolean visit = false;
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    if(ar[i][j] == '1'){
                        if(i+1 < n && ar[i+1][j] == '1' && j+1 < m && ar[i][j+1] == '1' && ar[i+1][j+1] == '0'){
                            visit = true;
                        }
                        if(i + 1 < n && ar[i+1][j] == '1' && j - 1 >= 0 && ar[i][j - 1] == '1' && ar[i+1][j - 1] == '0'){
                            visit = true;
                        }
                        if(i - 1 >= 0 && ar[i - 1][j] == '1' && j + 1 < m && ar[i][j + 1] == '1' && ar[i - 1][j + 1] == '0'){
                            visit = true;
                        }
                        if(i - 1 >= 0 && ar[i - 1][j] == '1' && j - 1 >= 0 && ar[i][j - 1] == '1' && ar[i - 1][j - 1] == '0'){
                            visit = true;
                        }
                    }
                }
            }
            if(visit){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}