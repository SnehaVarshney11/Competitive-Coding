package October;

class SatisfyTheEquation {
    static int[] satisfyEqn(int[] A, int N) {
        // code here
         int arr[] = {-1,-1,-1,-1};


        for(int a =0;a<N;a++){  
            for(int b=a+1;b<N;b++){ 
                for(int c =0; c<N;c++){ 
                    for(int d = c+1 ; d<N;d++){ 

                        if(!(a<b && a<c && c<d && b!=c && b!=d) ){  
                           continue;    
                        }   
                        if(A[a]+A[b] == A[c]+A[d]){ 
                            arr[0]=a;   
                            arr[1]=b;   
                            arr[2]=c;   
                            arr[3]=d;   

                            return arr; 
                        }   

                    }   
                }   
            }   
        }   

        return arr;
    }
}
