class PartitionNumberIntoTwoDivisibleParts {
    static String stringPartition(String S, int a, int b){
        // code here
        for(int i = 1; i < S.length(); i++){
            if((Integer.parseInt(S.substring(0,i))) % a == 0 
            && (Integer.parseInt(S.substring(i))) % b == 0){
                return String.format(S.substring(0,i) + " " + S.substring(i));
            }
        }
        return "-1";
    }    
}
