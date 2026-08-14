class Solution {
    public int countKDifference(int[] nums, int k) {
        int[] cnt = new int[101];
        int ans = 0;
        for (int x : nums) {
            if (x - k >= 1) ans += cnt[x - k];
            if (x + k <= 100) ans += cnt[x + k];
            cnt[x]++;
        }
        return ans;
    }
}