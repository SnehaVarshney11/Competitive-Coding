//Solution By -> @varshneysneha

import java.util.*;
class AP_Grid 
{
    public static void Row1(int p,int q){
        for(int  i= 0; i < q; i++)    {
            System.out.print(i+1+" ");
            System.out.println();
        }
        int fcd = 1+p+1;
        for(int i = 1; i < p; i++){
            int max = fcd;
            System.out.print(max + " ");
            for(int j = 1; j < q; j++){
                System.out.print(max+i+1+" ");
                max+=i+1;
            }
            fcd += p+1;
            System.out.println();
        }
    }
    
    public static void Row2(int p,int q){
        int getSum = 0;
        for(int i = 0, x = q+1; i < p; i++, x++){
            getSum = i+1;
            System.out.print(getSum+" ");
            for(int j = 1; j < q; j++){
                System.out.print(getSum + x + " ");
                getSum += x;
            }
            System.out.println();
        }
    }
    
    public static void main (String[] args) throws java.lang.Exception
    {
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       while(t-->0){
          int p = sc.nextInt();
          int q = sc.nextInt();
          if(p<q){
              Row1(p,q);
          }
          else{
              Row2(p,q);
          }
       }
       sc.close();
    }
}