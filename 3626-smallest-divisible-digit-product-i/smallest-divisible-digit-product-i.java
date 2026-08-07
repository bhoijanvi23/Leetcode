class Solution {
    public int smallestNumber(int n, int t) {
         while(true) {
            var s = Integer.toString(n, 10);
            int p = 1;
            for(int i = 0; i < s.length(); i++) {
                p *= Integer.parseInt(""+s.charAt(i));
            }
            if(p % t == 0) {
                return n;
            }
            n++;
         }
    }
}