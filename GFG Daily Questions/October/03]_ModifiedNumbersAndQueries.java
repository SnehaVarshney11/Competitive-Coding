package October;

class ModifiedNumbersAndQueries {
    public int sumOfAll(int l, int r)

    {
        int sum=0;  
        for(int i=l; i<=r; i++) 
        {   
            if(i==1)    
                sum += 1;   
            else    
            {   
                boolean p = isPrime(i); 
                if(p==true) 
                {   
                    sum += i;   
                }   
                else    
                {   
                    int noprime = noPrime(i);   
                    sum += noprime; 
                }   
            }   
                    
        }   
        return sum; 
    }
        
    public boolean isPrime(int n)

    {
        boolean flag = false;
        for (int i = 2; i <= n / 2; ++i)
        {
    
            if (n % i == 0)
            {
                flag = true;
                break;
            }
        }

 
        if (!flag)
            return true;
        else
            return false;

    }

    
    public int noPrime(int n)

    {
        int sum =0;
        for(int i=2; i<=n/2; i++)
        {
            if(n % i == 0)
            {
                boolean p = isPrime(i);
                if(p==true)
                    sum+=i;
            }
        }
        return sum;
    }
}
