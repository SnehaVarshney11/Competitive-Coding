import java.util.Scanner;

class Rock_Paper_Scissors{
    public static void main(String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            char[] a = new char[n];
            char[] b = new char[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.next().charAt(0);
            }
            b[n-1] = a[n-1];
            for(int i = n-2; i >= 0; i--){
                if(a[i] == a[i+1]){
                    b[i] = b[i+1];
                }
                else if((a[i] == 'P' && a[i+1] == 'S') || (a[i] == 'S' && a[i+1] == 'R') || (a[i] == 'R' && a[i+1] == 'P')){
                    b[i] = b[i+1];
                }
                else{
                    int j = i;
                    while(j < n-1){
                        if((a[i] == 'P' && a[j+1] == 'S') || (a[i] == 'S' && a[j+1] == 'R') || (a[i] == 'R' && a[j+1] == 'P') || (a[i] == a[j+1])){
                            b[i] = b[j+1];
                            break;
                        }
                        else if(j == n-2){
                            b[i] = a[i];
                            j++;
                        }
                        else{
                            j++;
                        }
                    }
                }
            }
            for(int i = 0; i < n; i++){
                System.out.println(b[i]);
            }
        }
    }
}