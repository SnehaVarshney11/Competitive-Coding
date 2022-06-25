package June;

import java.util.ArrayList;

class FillTheTank {
    long x = (long)Math.pow(10,18);
    int[] vis;
    boolean p;
    long minimum_amount(int [][]Edges, int N, int S, int []cap){
        // Code here
        p = false;
        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        int n = N;
        vis = new int[n+1];
        while(n>=0)
        {
            a.add(new ArrayList<Integer>());
            n--;
        }
        for (int[] e : Edges)
        {
            a.get(e[0]).add(e[1]);
            a.get(e[1]).add(e[0]);
        }
        long y = ch(a, N, S, cap);
        //System.out.println(y);
        if (p)
        return -1;
        return y>x?-1:y;
    }
    
    public long ch(ArrayList<ArrayList<Integer>> a, int n, int s, int[] c)
    {
        if (p)
        return -1;
        if (vis[s] == 1)
        return 0;
        vis[s] = 1;
        long max = 0;
        long no = 0;
        for (int i : a.get(s))
        {
            if (vis[i] == 0)
            {
                max = Math.max(ch(a, n, i, c), max);
                no++;
                if (max>x)
        {
            p = true;
            return -1;
        }
            }
        }
        if (max*no>x)
        {
            p = true;
            return -1;
        }
        return (c[s-1]+max*no);
    }
}
