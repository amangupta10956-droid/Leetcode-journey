class Solution {
    public int longestOnes(int[] arr, int k) {

        int n = arr.length;
        int i = 0, j = 0;
        int zero = 0;
        int maxLen = 0;

        while (j < n) {

            if (arr[j] == 0) {
                zero++;
            }

            while (zero > k) {

                if (arr[i] == 0) {
                    zero--;
                }

                i++;
            }

            int len = j - i + 1;
            maxLen = Math.max(maxLen, len);

            j++;
        }

        return maxLen;
    }
}