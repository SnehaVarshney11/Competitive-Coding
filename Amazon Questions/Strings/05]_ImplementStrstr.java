class ImplementStrstr{
    int strstr(String s, String x)
    {
       // Your code here
       String str;
        int x_size = x.length();
        if(s.contains(x)){
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == x.charAt(0)){
                    str = s.substring(i, i+x_size); 
                    if(str.equals(x)){
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}