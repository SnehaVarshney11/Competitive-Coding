package DecDailyQues;

class NumberComplement {
    public int findComplement(int num) {
        String str=Integer.toBinaryString(num);
        StringBuilder sb=new StringBuilder(str);
        StringBuilder sb1=new StringBuilder();
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='0')
                sb1.append("1");
            else
                sb1.append("0");
            }
        int res=Integer.parseInt(sb1.toString(),2);
        return res;
    }
}
