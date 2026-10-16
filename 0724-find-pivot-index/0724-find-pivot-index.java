class Solution {
    public int pivotIndex(int[] nums) {
       int total=0;
       for(int i=0;i<nums.length;i++){
        total=total+nums[i];
       } 
       int sumLeft=0;
       for(int i=0;i<nums.length;i++){

       
       int sumRight=total-sumLeft-nums[i];
       if(sumLeft==sumRight){
        return i;
       }
       sumLeft=sumLeft+nums[i];
       }
       return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna