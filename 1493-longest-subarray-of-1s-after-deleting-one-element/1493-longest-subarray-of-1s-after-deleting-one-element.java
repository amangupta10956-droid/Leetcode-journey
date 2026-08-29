class Solution {
    public int longestSubarray(int[] nums) {
        int n=nums.length;
        int i=0,j=0;
        int maxLen=0;
        int zero=0;

        while(j<n){
            if(nums[j]==0){
                zero++;
            }
            while(zero>1){
                if(nums[i]==0){
                    zero--;
                }
                i++;
            }
            int len=j-i;
            maxLen=Math.max(maxLen,len);
            j++;
        }
        return maxLen;
    }
}