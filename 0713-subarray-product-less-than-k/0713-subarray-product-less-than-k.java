class Solution {
    public int numSubarrayProductLessThanK(int[] arr, int target) {

        if (target <= 1) {
            return 0;
        }

        int n = arr.length;
        int i = 0;
        int product = 1;
        int count = 0;

        for (int j = 0; j < n; j++) {

            product *= arr[j];

            while (product >= target) {
                product /= arr[i];
                i++;
            }

            count += j - i + 1;
        }

        return count;
    }
}
