package June;

class FindingProfession {
    static char profession(int level, int pos){
        // code here
        int profession=1;
        while(pos>1){
            if(pos%2==0){
                profession=profession^1; 
            }
            pos = (pos+1)/2;
        }
        
        if(profession==1){
            return 'e';
        } else return 'd';
    }
}
