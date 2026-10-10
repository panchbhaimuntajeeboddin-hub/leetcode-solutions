class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] result=new int[n];
        int left=0;
        int right=n-1;
        for(int i=n-1;i>=0;i--){
            if(Math.abs(nums[left])>Math.abs(nums[right])){
                result[i]=nums[left]*nums[left];
                left++;
            }
            else{
                   result[i]=nums[right]*nums[right];
                   right--;
            }
        }
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna