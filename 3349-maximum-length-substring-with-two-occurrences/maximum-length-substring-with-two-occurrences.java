class Solution {
    public int maximumLengthSubstring(String s) {
        int maxLength=0;
        int left=0;
        int[]freq=new int[26];
        for(int i=0;i<s.length();i++){
            char currChar=s.charAt(i);
            freq[currChar-'a']++;
            while(freq[currChar-'a']>2){
                freq[s.charAt(left)-'a']--;
                left++;
            }
        
        maxLength=Math.max(maxLength, i - left +1);
        }
        return maxLength;
    }
}