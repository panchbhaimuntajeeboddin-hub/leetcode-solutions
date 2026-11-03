class Solution {
    public int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {
        return Math.max(helper(nums,firstLen,secondLen),helper(nums,secondLen,firstLen)
        );
    }
    public int helper(int[]nums,int L,int M){
        int n=nums.length;
        int[]prefix=new int[n+1];
        for(int i=0;i<n;i++){
            prefix[i+1]=prefix[i]+nums[i];
        }
        int maxLeft=0;
        int ans=0;
        for(int j=L;j+M<=n;j++){
        int leftSum=prefix[j]-prefix[j-L];
        maxLeft=Math.max(maxLeft, leftSum);
           int rightSum=prefix[j+M]-prefix[j];
        ans = Math.max(ans, maxLeft + rightSum);
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna