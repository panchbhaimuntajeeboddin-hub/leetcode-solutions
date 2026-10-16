class NumArray {
   int[] nums;
    public NumArray(int[] nums) {
        this.nums=nums;
    }
    
    public int sumRange(int left, int right) {
        int sum=0;
        for(int i=left;i<=right;i++){
            sum=sum+nums[i];
        }
        return sum;
    }
}



// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna