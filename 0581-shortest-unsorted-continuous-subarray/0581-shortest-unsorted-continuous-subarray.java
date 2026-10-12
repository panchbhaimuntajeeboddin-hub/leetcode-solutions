class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] sorted=nums.clone();
        Arrays.sort(sorted);
        int start=0;
        int end=nums.length-1;
        while(start<nums.length&&nums[start]==sorted[start]){
            start++;
        }
            if(start==nums.length){
                return 0;
            }
            while(end>=0&&nums[end]==sorted[end]){
                end--;
            }
        return end-start+1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna