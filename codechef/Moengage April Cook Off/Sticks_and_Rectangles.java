// Code by Sneha Varshney

import java.util.HashMap;
import java.util.Scanner;

class Sticks_and_Rectangles{
    static int gcd(int a, int b)
    {
        // Everything divides 0
        if (a == 0)
          return b;
        if (b == 0)
          return a;
      
        // base case
        if (a == b)
            return a;
      
        // a is greater
        if (a > b)
            return gcd(a-b, b);
        return gcd(a, b-a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-->0){
            int n = sc.nextInt();//number of given sticks.
            int[] l = new int[n];//length of the sticks.
            HashMap<Integer, Integer> hmap =  new HashMap<>();
            int i = 0;
            while(i < n){
                l[i] = sc.nextInt();
                hmap.get(l[i]++);
                i++;
            }
            int count = 0;
            for(Integer pair : hmap.keySet()){
                if(hmap.get(pair) != 0){
                    gcd(2, 3);
                    count++;
                }
            }
            for(; (n+count)%4 != 0; ){
                count++;
            }
            System.out.println(count);
            sc.close();
        }
    }
}