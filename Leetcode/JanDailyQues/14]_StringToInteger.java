package JanDailyQues;

class StringToInteger {
    public int myAtoi(String s) {
        char[] ch = s.toCharArray();
		//hold computed result
		int res = 0;
		//hold true if negative 
		boolean isNegative = false;
		int i = 0;
		//remove spaces
		while (i < ch.length && ch[i] == ' ') {
			i++;
		}
		//check if number is negative
		if (i < ch.length && (ch[i] == '-' || ch[i] == '+')) {
			isNegative = ch[i] == '-';
			i++;
		}
		//iterate remaining array till digit found else break it
		for (; i < ch.length && ch[i] >= '0' && ch[i] <= '9'; i++) {
			//if overflow occurred return either min_value or max_value
			if (Integer.MAX_VALUE / 10 < res
					|| (Integer.MAX_VALUE / 10 == res && Integer.MAX_VALUE % 10 < (ch[i] - '0'))) {
				return (isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE);
			}
			//compute result
			res = res * 10 + (ch[i] - '0');
		}
		//last just return the answer
		return isNegative ? -res : res;
    }
}
