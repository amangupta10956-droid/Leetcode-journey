class Solution {
    public int longestSubarray(int[] arr) {

        int n = arr.length;
        int i = 0, j = 0;
        int zero = 0;
        int maxLen = 0;

        while (j < n) {

            if (arr[j] == 0) {
                zero++;
            }

            while (zero > 1) {
                if (arr[i] == 0) {
                    zero--;
                }
                i++;
            }

            int len = j - i;
            maxLen = Math.max(maxLen, len);

            j++;
        }

        return maxLen;
    }
}