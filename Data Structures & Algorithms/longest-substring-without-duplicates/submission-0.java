class Solution {
    public int lengthOfLongestSubstring(String s) {
        int hashLen = 256;//since 256 characters are present for strings
        int hash [] = new int[hashLen];

        Arrays.fill(hash,-1);
        int n = s.length();
        int l = 0 ;
        int r = 0;
        int len = 0;
        int maxLen = 0;

        while(r<n){
            if(hash[s.charAt(r)]!= -1){
                if(hash[s.charAt(r)]>=l){
                    l = hash[s.charAt(r)]+1;
                }
            }
            len = r-l+1;
            maxLen = Math.max(len,maxLen);
            hash[s.charAt(r)] = r;
            r++;
        }

        return maxLen;
    }
}
