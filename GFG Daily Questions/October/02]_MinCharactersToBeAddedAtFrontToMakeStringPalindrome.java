package October;

class MinCharactersToBeAddedAtFrontToMakeStringPalindrome {
    public static int minChar(String s) {
        //Write your code here
        int n = s.length();
     
     int i = 0; 
     int j = n-1;
     int ans = n-1;
     
     while(i < j)
     {
         if(s.charAt(i) == s.charAt(j))
         {
             i++;
             j--;
         }
         else{
             i = 0;
             ans--;
             j = ans;
         }
     }
     return n-ans-1;
     }
}
