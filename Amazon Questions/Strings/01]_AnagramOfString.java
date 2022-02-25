class AnagramOfString {
    final int CHARS = 26;
	public int remAnagrams(String s,String s1)
        {
        //add code here.
        int[] ar = new int[CHARS];
        for(int i = 0; i < s.length(); i++){
            ar[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < s1.length(); i++){
            ar[s1.charAt(i) - 'a']--;
        }
        int ans = 0;
        for(int i = 0; i < CHARS; i++){
            ans += Math.abs(ar[i]);
        }
        return ans;
        }
}
