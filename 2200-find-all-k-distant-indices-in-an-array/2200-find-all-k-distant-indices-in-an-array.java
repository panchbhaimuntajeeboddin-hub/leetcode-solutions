class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
      List<Integer> ans=new ArrayList<>();
      for(int i=0;i<nums.length;i++){   
        for(int j=0;j<nums.length;j++){
            if(nums[j]==key&&Math.abs(i-j)<=k){
                ans.add(i);
                break;
            }
        }
      }  
      return ans;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna