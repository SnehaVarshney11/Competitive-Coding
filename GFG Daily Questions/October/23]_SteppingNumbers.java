package October;

import java.util.LinkedList;
import java.util.Queue;

class SteppingNumbers {
    int bfs(int n, int m, int num)

    {

        int count = 0;

        Queue<Integer> q=new LinkedList<>();    
        q.add(num); 
        while (!q.isEmpty())    
        {   
        int stepNum = q.poll(); 
        if (stepNum <= m && stepNum >= n)   
        count++;    
        if (num == 0 || stepNum > m)    
        continue;   
        int lastDigit = stepNum % 10;   
        int stepNumA = stepNum * 10 + (lastDigit- 1);   
        int stepNumB = stepNum * 10 + (lastDigit + 1);  
        
        if (lastDigit != 9) 
        q.add(stepNumB);    
        if (lastDigit != 0) 
        q.add(stepNumA);    
        
        }   
        return count;

    }

 

    int steppingNumbers(int n, int m)

    {

        int ans = 0;

     for (int i = 0 ; i <= 9 ; i++){

         ans += bfs(n, m, i);

     }

     return ans;

    }
}
