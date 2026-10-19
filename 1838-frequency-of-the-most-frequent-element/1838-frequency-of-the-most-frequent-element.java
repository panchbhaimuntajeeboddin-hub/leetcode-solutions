class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);

        int left = 0;
        long sum = 0;
        int frq = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right]; 

        while ((long) nums[right] * (right - left + 1) - sum > k) {
                sum -= nums[left];  
                left++;
            }

     frq = Math.max(frq, right - left + 1);
        }
 return frq;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna