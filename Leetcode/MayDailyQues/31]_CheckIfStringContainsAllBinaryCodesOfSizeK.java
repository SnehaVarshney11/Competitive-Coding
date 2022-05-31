class Solution {
    public boolean hasAllCodes(String s, int k) {
        var hs = new HashSet<String>();
	    for (var i = 0; i + k <= s.length(); i++)
		    hs.add(s.substring(i, i + k));
	    return hs.size() == Math.pow(2, k);
    }
}