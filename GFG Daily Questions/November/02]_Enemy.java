package November;

import java.util.Arrays;

class Enemy {
    public static int largestArea(int n,int m,int k,int[][] enemy) {
        // code here
        int[] rows=new int[k+1];

        int[] cols=new int[k+1];

        for(int i=0;i<k;i++){

            rows[i]=enemy[i][0];

            cols[i]=enemy[i][1];

        }

        rows[k]=n+1;

        cols[k]=m+1;

        Arrays.sort(rows);

        Arrays.sort(cols);

        int mx1=rows[0]-1;

        int mx2=cols[0]-1;

        for(int i=1;i<=k;i++)

        mx1=Math.max(mx1,rows[i]-rows[i-1]-1);

        for(int i=1;i<=k;i++)

        mx2=Math.max(mx2,cols[i]-cols[i-1]-1);

        return mx1*mx2;
    }
}
