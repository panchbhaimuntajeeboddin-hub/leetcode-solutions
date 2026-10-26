class Solution {
    public int longestNiceSubarray(int[] nums) {
        int left=0;
        int usedBits=0;
        int max=0;
        for(int right=0;right<nums.length;right++){
            while((usedBits&nums[right])!=0){
                usedBits^=nums[left];
                left++;
            }
            usedBits|=nums[right];
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna