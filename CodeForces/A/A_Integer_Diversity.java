package CodeForces.A;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A_Integer_Diversity{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int t = sc.nextInt();
        while(t-->0){
           int n = sc.nextInt();
           Set<Integer> st = new HashSet<>();
           for(int i = 0; i < n; i++){
               int x = sc.nextInt();
               int size = st.size();
               st.add(x);
               if(size == st.size()){
                   x *= -1;
                   st.add(x);
               }
           }
           System.out.println(st.size());

        }
    }
}