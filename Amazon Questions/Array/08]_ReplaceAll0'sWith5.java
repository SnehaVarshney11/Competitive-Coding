class ReplaceAll0With5 {
    static int convertToFive(int num){
        if(num == 0) return 0;
        
        int digit = num % 10;
        if(digit == 0){
            digit = 5;
        }
        return convertToFive(num / 10) * 10 + digit;
    }
    int convertfive(int num) {
        // Your code here
        if(num == 0) return 5;
        else{
            return convertToFive(num);
        }
    }
}
